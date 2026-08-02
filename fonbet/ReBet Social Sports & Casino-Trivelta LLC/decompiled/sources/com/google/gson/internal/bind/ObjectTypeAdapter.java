package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.reflect.TypeToken;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final v f38138c = b(t.f38337a);

    /* renamed from: a, reason: collision with root package name */
    public final Gson f38139a;

    /* renamed from: b, reason: collision with root package name */
    public final u f38140b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[Jb.b.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[Jb.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static v a(u uVar) {
        return uVar == t.f38337a ? f38138c : b(uVar);
    }

    private static v b(final u uVar) {
        return new v() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, u.this);
                }
                return null;
            }
        };
    }

    public final Object c(Jb.a aVar, Jb.b bVar) {
        int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.M0();
        }
        if (i10 == 4) {
            return this.f38140b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.D0());
        }
        if (i10 == 6) {
            aVar.n1();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public final Object d(Jb.a aVar, Jb.b bVar) {
        int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[bVar.ordinal()];
        if (i10 == 1) {
            aVar.p();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.m();
        return new g();
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(Jb.a aVar) {
        Jb.b Y12 = aVar.Y1();
        Object d10 = d(aVar, Y12);
        if (d10 == null) {
            return c(aVar, Y12);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String f02 = d10 instanceof Map ? aVar.f0() : null;
                Jb.b Y13 = aVar.Y1();
                Object d11 = d(aVar, Y13);
                boolean z10 = d11 != null;
                if (d11 == null) {
                    d11 = c(aVar, Y13);
                }
                if (d10 instanceof List) {
                    ((List) d10).add(d11);
                } else {
                    ((Map) d10).put(f02, d11);
                }
                if (z10) {
                    arrayDeque.addLast(d10);
                    d10 = d11;
                }
            } else {
                if (d10 instanceof List) {
                    aVar.n();
                } else {
                    aVar.t();
                }
                if (arrayDeque.isEmpty()) {
                    return d10;
                }
                d10 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.T1();
            return;
        }
        TypeAdapter p10 = this.f38139a.p(obj.getClass());
        if (!(p10 instanceof ObjectTypeAdapter)) {
            p10.write(cVar, obj);
        } else {
            cVar.B();
            cVar.w0();
        }
    }

    public ObjectTypeAdapter(Gson gson, u uVar) {
        this.f38139a = gson;
        this.f38140b = uVar;
    }
}
