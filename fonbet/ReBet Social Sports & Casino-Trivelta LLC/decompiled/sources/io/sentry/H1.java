package io.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.EventKeys;
import io.sentry.rrweb.a;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class H1 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f50357a;

    /* renamed from: b, reason: collision with root package name */
    public List f50358b;

    /* renamed from: c, reason: collision with root package name */
    public Map f50359c;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebEventType;
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebEventType = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource = iArr2;
            try {
                iArr2[d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource[d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b implements InterfaceC4859w0 {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        
            if (r12.equals("breadcrumb") == false) goto L36;
         */
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public H1 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            H1 h12 = new H1();
            interfaceC4809q1.m();
            ArrayList arrayList = null;
            HashMap hashMap = null;
            Integer num = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("segment_id")) {
                    num = interfaceC4809q1.Q0();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            interfaceC4809q1.t();
            interfaceC4809q1.q(true);
            List list = (List) interfaceC4809q1.H1();
            interfaceC4809q1.q(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        io.sentry.util.u uVar = new io.sentry.util.u(map);
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i10 = a.$SwitchMap$io$sentry$rrweb$RRWebEventType[cVar.ordinal()];
                                char c10 = 2;
                                if (i10 == 1) {
                                    Map map2 = (Map) map.get(EventKeys.DATA);
                                    if (map2 == null) {
                                        map2 = Collections.EMPTY_MAP;
                                    }
                                    Integer num2 = (Integer) map2.get("source");
                                    if (num2 != null) {
                                        d.b bVar = d.b.values()[num2.intValue()];
                                        int i11 = a.$SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource[bVar.ordinal()];
                                        if (i11 == 1) {
                                            arrayList.add(new e.a().a(uVar, iLogger));
                                        } else if (i11 != 2) {
                                            iLogger.c(EnumC4788n3.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(new f.a().a(uVar, iLogger));
                                        }
                                    }
                                } else if (i10 == 2) {
                                    arrayList.add(new g.a().a(uVar, iLogger));
                                } else if (i10 != 3) {
                                    iLogger.c(EnumC4788n3.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map3 = (Map) map.get(EventKeys.DATA);
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map3.get("tag");
                                    if (str2 != null) {
                                        switch (str2.hashCode()) {
                                            case -226040934:
                                                if (str2.equals("performanceSpan")) {
                                                    c10 = 0;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 112202875:
                                                if (str2.equals("video")) {
                                                    c10 = 1;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1106718723:
                                                break;
                                            default:
                                                c10 = 65535;
                                                break;
                                        }
                                        switch (c10) {
                                            case 0:
                                                arrayList.add(new i.a().a(uVar, iLogger));
                                                break;
                                            case 1:
                                                arrayList.add(new j.a().a(uVar, iLogger));
                                                break;
                                            case 2:
                                                arrayList.add(new a.C0769a().a(uVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(EnumC4788n3.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            h12.c(num);
            h12.b(arrayList);
            h12.d(hashMap);
            return h12;
        }
    }

    public List a() {
        return this.f50358b;
    }

    public void b(List list) {
        this.f50358b = list;
    }

    public void c(Integer num) {
        this.f50357a = num;
    }

    public void d(Map map) {
        this.f50359c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H1.class == obj.getClass()) {
            H1 h12 = (H1) obj;
            if (io.sentry.util.w.a(this.f50357a, h12.f50357a) && io.sentry.util.w.a(this.f50358b, h12.f50358b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50357a, this.f50358b);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f50357a != null) {
            interfaceC4813r1.d("segment_id").i(this.f50357a);
        }
        Map map = this.f50359c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f50359c.get(str));
            }
        }
        interfaceC4813r1.t();
        interfaceC4813r1.q(true);
        if (this.f50357a != null) {
            interfaceC4813r1.g(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        List list = this.f50358b;
        if (list != null) {
            interfaceC4813r1.j(iLogger, list);
        }
        interfaceC4813r1.q(false);
    }
}
