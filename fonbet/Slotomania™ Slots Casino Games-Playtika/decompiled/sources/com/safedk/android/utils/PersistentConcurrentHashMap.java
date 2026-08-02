package com.safedk.android.utils;

import android.content.SharedPreferences;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.security.InvalidParameterException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public class PersistentConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    private static final String a = "SafeDKCache";
    private static final String b = "PersistentConcurrentHashMap";
    private static final List<PersistentConcurrentHashMap<?, ?>> c = new ArrayList();
    private static final long serialVersionUID = 7611795083821185660L;
    private volatile String d;
    private volatile LinkedHashSet<K> g;
    private volatile String e = "";
    private volatile int f = -1;
    private volatile AtomicBoolean h = new AtomicBoolean(false);

    public static void a() {
        ArrayList<PersistentConcurrentHashMap> arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        Logger.d(b, "save all maps...");
        synchronized (c) {
            arrayList = new ArrayList(c);
        }
        for (PersistentConcurrentHashMap persistentConcurrentHashMap : arrayList) {
            if (persistentConcurrentHashMap.h.get()) {
                Logger.d(b, "save all maps, map key=", persistentConcurrentHashMap.d, ", size before filtering=", Integer.valueOf(persistentConcurrentHashMap.size()));
                e.a(persistentConcurrentHashMap, persistentConcurrentHashMap.d);
                Logger.d(b, "save all maps, map key=", persistentConcurrentHashMap.d, ", size after filtering=", Integer.valueOf(persistentConcurrentHashMap.size()));
                persistentConcurrentHashMap.f();
            }
        }
        Logger.d(b, "save all maps done in ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " ms");
    }

    public void a(String str) {
        this.e += com.safedk.android.analytics.brandsafety.m.ad + str;
        Logger.d(b, "sdk_null_check added value ", str);
    }

    public String b() {
        return this.e;
    }

    public PersistentConcurrentHashMap(String sharePrefsKey) {
        a(sharePrefsKey, -1);
    }

    public PersistentConcurrentHashMap(String sharePrefsKey, int capacityLimit) {
        a(sharePrefsKey, capacityLimit);
    }

    private synchronized void a(String str, int i) {
        if (str != null) {
            if (!str.isEmpty()) {
                synchronized (c) {
                    c.add(this);
                }
                this.d = str;
                this.f = i;
                if (i > -1) {
                    this.g = new LinkedHashSet<>(i, 1.0f);
                    Logger.d(b, "PersistentConcurrentHashMap filename = ", e(), ", capacity limit = ", Integer.valueOf(i));
                }
                Logger.d(b, "PersistentConcurrentHashMap instance created, filename = ", e());
                g();
            }
        }
        throw new InvalidParameterException("argument sharePrefsKey cannot be empty");
    }

    public PersistentConcurrentHashMap() {
    }

    public synchronized K c() {
        if (this.g != null) {
            Iterator<K> it = this.g.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    private PersistentConcurrentHashMap(int initialCapacity) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(Map m) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void putAll(Map map) {
        Logger.v(b, "putAll started");
        for (K k : map.keySet()) {
            put(k, map.get(k));
            if (this.g != null) {
                this.g.add(k);
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (keySet().contains(key)) {
            super.remove(key);
            if (this.g != null) {
                this.g.remove(key);
            }
            Logger.d(b, "put filename = ", e(), ", removed existing key ", key);
        }
        super.put(key, value);
        d();
        if (this.g != null) {
            this.g.add(key);
        }
        Logger.d(b, "put filename = ", e(), ", added key ", key);
        this.h.set(true);
        return value;
    }

    private synchronized void d() {
        if (this.f > -1 && size() > this.f) {
            K c2 = c();
            if (c2 != null) {
                remove(c2);
                Logger.d(b, "remove oldest entry if necessary, filename = ", e(), ", removed key ", c2);
            } else {
                Logger.d(b, "remove oldest entry if necessary, filename = ", e(), ", first item is null");
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        if (key == null) {
            return false;
        }
        boolean remove = super.remove(key, value);
        if (this.g != null) {
            this.g.remove(key);
        }
        if (remove) {
            Logger.d(b, "remove filename = ", e(), ", removed key ", key);
            this.h.set(true);
        }
        return remove;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        V v = (V) super.remove(obj);
        if (this.g != null) {
            this.g.remove(obj);
        }
        if (v != null) {
            Logger.v(b, "remove filename=", e(), ", removed key ", obj);
            this.h.set(true);
        }
        return v;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean replace(K key, V oldValue, V newValue) {
        boolean replace;
        replace = super.replace(key, oldValue, newValue);
        if (replace) {
            Logger.d(b, "replace filename = ", e(), ", replace key ", key.toString());
            this.h.set(true);
        }
        return replace;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized V replace(K k, V v) {
        V v2;
        v2 = (V) super.replace(k, v);
        if (v2 != null) {
            Logger.d(b, "replace filename = ", e(), ", replace key ", k.toString());
            this.h.set(true);
        }
        return v2;
    }

    private String e() {
        return "SafeDKCache_" + this.d;
    }

    private void f() {
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().m().getSharedPreferences(e(), 0);
            if (sharedPreferences == null) {
                Logger.d(b, "saveMap cannot get share prefs object");
                return;
            }
            if (this.h.get()) {
                String a2 = i.a(this);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (sharedPreferences.contains(this.d)) {
                    edit.remove(this.d).apply();
                }
                edit.putString(this.d, a2);
                edit.apply();
                Object[] objArr = new Object[6];
                objArr[0] = "Map saved, key=";
                objArr[1] = e();
                objArr[2] = ", size=";
                objArr[3] = Integer.valueOf(size());
                objArr[4] = ", content length=";
                objArr[5] = a2 != null ? Integer.valueOf(a2.length()) : AbstractJsonLexerKt.NULL;
                Logger.v(b, objArr);
                this.h.set(false);
            }
        } catch (Exception e) {
            Logger.d(b, "Exception while saving map data", e);
        }
    }

    private void g() {
        Logger.d(b, "loadMap started, map key=", e());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().m().getSharedPreferences(e(), 0);
            new ConcurrentHashMap();
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(this.d, null);
                if (string != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i.a(string);
                    Logger.d(b, "loadMap (", e(), ") content length = ", Integer.valueOf(string.length()), ", concurrentHashMap size = ", Integer.valueOf(concurrentHashMap.size()));
                    for (Map.Entry<K, V> entry : concurrentHashMap.entrySet()) {
                        if (entry.getValue() instanceof CreativeInfo) {
                            CreativeInfo creativeInfo = (CreativeInfo) entry.getValue();
                            if (creativeInfo.ab() != null && creativeInfo.ab().before(new Timestamp(currentTimeMillis))) {
                                Logger.d(b, "loadMap (", e(), ") remove expired item: ", creativeInfo.aa());
                            } else {
                                creativeInfo.a(com.safedk.android.analytics.brandsafety.m.c, new m.a[0]);
                                creativeInfo.ad();
                                put(entry.getKey(), entry.getValue());
                                if (this.g != null) {
                                    this.g.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof List) {
                            List list = (List) entry.getValue();
                            if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                                CreativeInfo creativeInfo2 = (CreativeInfo) list.get(0);
                                if (creativeInfo2.ab() != null && creativeInfo2.ab().before(new Timestamp(currentTimeMillis))) {
                                    Logger.d(b, "loadMap (", e(), ") remove expired item: ", creativeInfo2.aa(), ", prefetch time: ", Long.valueOf(creativeInfo2.ag()), ", expiration time: ", creativeInfo2.ab());
                                } else {
                                    creativeInfo2.a(com.safedk.android.analytics.brandsafety.m.c, new m.a[0]);
                                    creativeInfo2.ad();
                                    put(entry.getKey(), entry.getValue());
                                    if (this.g != null) {
                                        this.g.add(entry.getKey());
                                    }
                                }
                            }
                        } else if (entry.getValue() instanceof Boolean) {
                            put(entry.getKey(), entry.getValue());
                            if (this.g != null) {
                                this.g.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof StatsEvent) {
                            put(entry.getKey(), entry.getValue());
                            if (this.g != null) {
                                this.g.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof RedirectData) {
                            Logger.d(b, "loadMap item key: ", entry.getKey(), ", value: ", entry.getValue());
                            put(entry.getKey(), entry.getValue());
                            if (this.g != null) {
                                this.g.add(entry.getKey());
                            }
                        }
                    }
                } else {
                    Logger.d(b, "loadMap map is empty");
                }
                Logger.d(b, "loadMap loaded map ", e(), " : ", Integer.valueOf(size()), " items");
                f();
            }
        } catch (InvalidClassException e) {
            Logger.d(b, "loadMap Exception loading Map from file : ", e(), e);
            this.h.set(true);
        } catch (IllegalArgumentException e2) {
            Logger.d(b, "loadMap Data mismatch exception loading Map from file : ", e(), e2);
            this.h.set(true);
        } catch (Throwable th) {
            Logger.e(b, "loadMap Error loading Map from file : ", e(), th);
            this.h.set(true);
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
        this.h.set(true);
    }
}
