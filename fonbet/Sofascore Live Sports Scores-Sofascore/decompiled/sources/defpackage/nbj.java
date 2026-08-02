package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nbj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tbj t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbj(tbj tbjVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = tbjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        tbj tbjVar = this.t;
        switch (i) {
            case 0:
                nbj nbjVar = new nbj(tbjVar, rq3Var, 0);
                long j = ((dnd) obj).a;
                return nbjVar;
            case 1:
                return new nbj(tbjVar, rq3Var, 1);
            default:
                return new nbj(tbjVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                long j = ((dnd) obj).a;
                break;
        }
        return ((nbj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0048, code lost:
    
        if (r7 == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0419, code lost:
    
        if (r0 == r1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03f4, code lost:
    
        if (r5.t(r45) == r1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02ae, code lost:
    
        if (r0 == r1) goto L144;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        q80 q80Var;
        Object obj2;
        Object obj3;
        CharSequence text;
        CharSequence charSequence;
        ArrayList arrayList;
        byte b;
        byte b2;
        int i2 = this.r;
        byte b3 = 2;
        byte b4 = 1;
        tbj tbjVar = this.t;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                Pair f = tbjVar.f();
                if (f != null) {
                    String str = (String) f.a;
                    long j = ((pej) f.b).a;
                    eje ejeVar = tbjVar.i;
                    if (ejeVar != null) {
                        this.s = 2;
                        Object d = ((kje) ejeVar).d(str, j, this);
                        if (d != lu3Var) {
                            d = Unit.a;
                            break;
                        }
                    }
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (pej.d(tbjVar.l().b) || !tbjVar.h()) {
                        i = 1;
                        q80Var = null;
                    } else {
                        q80Var = z1a.J(tbjVar.l());
                        q80 M = z1a.M(tbjVar.l(), tbjVar.l().a.b.length());
                        q80 L = z1a.L(tbjVar.l(), tbjVar.l().a.b.length());
                        o80 o80Var = new o80(M);
                        o80Var.b(L);
                        q80 h = o80Var.h();
                        int g = pej.g(tbjVar.l().b);
                        tbjVar.c.invoke(tbj.b(h, t6a.g(g, g)));
                        tbjVar.r(p69.a);
                        i = 1;
                        tbjVar.a.e = true;
                    }
                    if (q80Var != null) {
                        iy2 iy2Var = tbjVar.g;
                        if (iy2Var != null) {
                            gy2 Q = oyn.Q(q80Var);
                            this.s = i;
                            if (((fy) iy2Var).a(Q) == lu3Var2) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    iy2 iy2Var2 = tbjVar.g;
                    if (iy2Var2 != null) {
                        this.s = 1;
                        ClipData primaryClip = ((fy) iy2Var2).a.a().getPrimaryClip();
                        if (primaryClip == null) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = new gy2(primaryClip);
                            break;
                        }
                    }
                } else if (i5 == 1) {
                    y6a.M(obj);
                    obj2 = obj;
                } else if (i5 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    obj3 = obj;
                    q80 q80Var2 = (q80) obj3;
                    if (q80Var2 != null) {
                        if (tbjVar.h()) {
                            o80 o80Var2 = new o80(z1a.M(tbjVar.l(), tbjVar.l().a.b.length()));
                            o80Var2.b(q80Var2);
                            q80 h2 = o80Var2.h();
                            q80 L2 = z1a.L(tbjVar.l(), tbjVar.l().a.b.length());
                            o80 o80Var3 = new o80(h2);
                            o80Var3.b(L2);
                            q80 h3 = o80Var3.h();
                            int length = q80Var2.b.length() + pej.g(tbjVar.l().b);
                            tbjVar.c.invoke(tbj.b(h3, t6a.g(length, length)));
                            tbjVar.r(p69.a);
                            tbjVar.a.e = true;
                        }
                        break;
                    }
                    break;
                }
                gy2 gy2Var = (gy2) obj2;
                if (gy2Var != null) {
                    this.s = 2;
                    byte b5 = 0;
                    ClipData.Item itemAt = gy2Var.a.getItemAt(0);
                    if (itemAt != null && (text = itemAt.getText()) != null) {
                        if (!(text instanceof Spanned)) {
                            obj3 = new q80(text.toString());
                            break;
                        } else {
                            Spanned spanned = (Spanned) text;
                            Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                            ArrayList arrayList2 = new ArrayList();
                            int D = ph0.D(annotationArr);
                            if (D >= 0) {
                                int i6 = 0;
                                while (true) {
                                    Annotation annotation = annotationArr[i6];
                                    if (Intrinsics.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                        int spanStart = spanned.getSpanStart(annotation);
                                        int spanEnd = spanned.getSpanEnd(annotation);
                                        j0l j0lVar = new j0l(annotation.getValue());
                                        Parcel parcel = (Parcel) j0lVar.b;
                                        b = b5;
                                        long j2 = r13.i;
                                        long j3 = j2;
                                        long j4 = lfj.c;
                                        long j5 = j4;
                                        wg8 wg8Var = null;
                                        rg8 rg8Var = null;
                                        sg8 sg8Var = null;
                                        String str2 = null;
                                        sn1 sn1Var = null;
                                        zcj zcjVar = null;
                                        v8j v8jVar = null;
                                        qah qahVar = null;
                                        while (parcel.dataAvail() > b4) {
                                            byte readByte = parcel.readByte();
                                            if (readByte == b4) {
                                                if (parcel.dataAvail() >= 8) {
                                                    j2 = j0lVar.m();
                                                } else {
                                                    charSequence = text;
                                                }
                                            } else if (readByte == b3) {
                                                if (parcel.dataAvail() >= 5) {
                                                    j4 = j0lVar.o();
                                                } else {
                                                    charSequence = text;
                                                }
                                            } else if (readByte == 3) {
                                                if (parcel.dataAvail() >= 4) {
                                                    wg8Var = new wg8(parcel.readInt());
                                                    b3 = 2;
                                                } else {
                                                    charSequence = text;
                                                }
                                            } else if (readByte == 4) {
                                                if (parcel.dataAvail() >= b4) {
                                                    byte readByte2 = parcel.readByte();
                                                    rg8Var = new rg8((readByte2 != 0 && readByte2 == b4) ? b4 : b);
                                                    b3 = 2;
                                                } else {
                                                    charSequence = text;
                                                }
                                            } else if (readByte != 5) {
                                                if (readByte == 6) {
                                                    str2 = parcel.readString();
                                                } else if (readByte == 7) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        j5 = j0lVar.o();
                                                    } else {
                                                        charSequence = text;
                                                    }
                                                } else if (readByte == 8) {
                                                    if (parcel.dataAvail() >= 4) {
                                                        sn1Var = new sn1(parcel.readFloat());
                                                    } else {
                                                        charSequence = text;
                                                    }
                                                } else if (readByte != 9) {
                                                    if (readByte != 10) {
                                                        if (readByte != 11) {
                                                            charSequence = text;
                                                            if (readByte == 12) {
                                                                if (parcel.dataAvail() >= 20) {
                                                                    text = charSequence;
                                                                    qahVar = new qah(j0lVar.m(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L), parcel.readFloat());
                                                                    b3 = 2;
                                                                    b4 = 1;
                                                                }
                                                            }
                                                        } else if (parcel.dataAvail() >= 4) {
                                                            int readInt = parcel.readInt();
                                                            byte b6 = (readInt & 2) != 0 ? b4 : b;
                                                            byte b7 = (readInt & 1) != 0 ? b4 : b;
                                                            v8j v8jVar2 = v8j.d;
                                                            v8j v8jVar3 = v8j.c;
                                                            if (b6 == 0 || b7 == 0) {
                                                                charSequence = text;
                                                                v8jVar = b6 != 0 ? v8jVar2 : b7 != 0 ? v8jVar3 : v8j.b;
                                                            } else {
                                                                List j6 = b.j(v8jVar2, v8jVar3);
                                                                Integer valueOf = Integer.valueOf(b);
                                                                int size = j6.size();
                                                                int i7 = b;
                                                                while (i7 < size) {
                                                                    valueOf = Integer.valueOf(((v8j) j6.get(i7)).a | valueOf.intValue());
                                                                    i7++;
                                                                    text = text;
                                                                }
                                                                charSequence = text;
                                                                v8jVar = new v8j(valueOf.intValue());
                                                            }
                                                        }
                                                        text = charSequence;
                                                        b3 = 2;
                                                        b4 = 1;
                                                    } else if (parcel.dataAvail() >= 8) {
                                                        j3 = j0lVar.m();
                                                    }
                                                    charSequence = text;
                                                } else if (parcel.dataAvail() >= 8) {
                                                    zcjVar = new zcj(parcel.readFloat(), parcel.readFloat());
                                                } else {
                                                    charSequence = text;
                                                }
                                                b3 = 2;
                                            } else if (parcel.dataAvail() >= b4) {
                                                byte readByte3 = parcel.readByte();
                                                if (readByte3 != 0) {
                                                    if (readByte3 == b4) {
                                                        b2 = AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                    } else if (readByte3 == 3) {
                                                        b2 = 2;
                                                    } else if (readByte3 == 2) {
                                                        b2 = b4;
                                                    }
                                                    sg8Var = new sg8(b2);
                                                    b3 = 2;
                                                }
                                                b2 = b;
                                                sg8Var = new sg8(b2);
                                                b3 = 2;
                                            } else {
                                                charSequence = text;
                                            }
                                            arrayList2.add(new p80(new pwh(j2, j4, wg8Var, rg8Var, sg8Var, (tf8) null, str2, j5, sn1Var, zcjVar, (eib) null, j3, v8jVar, qahVar, 49152), spanStart, spanEnd));
                                        }
                                        charSequence = text;
                                        arrayList2.add(new p80(new pwh(j2, j4, wg8Var, rg8Var, sg8Var, (tf8) null, str2, j5, sn1Var, zcjVar, (eib) null, j3, v8jVar, qahVar, 49152), spanStart, spanEnd));
                                    } else {
                                        charSequence = text;
                                        b = b5;
                                    }
                                    if (i6 != D) {
                                        i6++;
                                        b5 = b;
                                        text = charSequence;
                                        b3 = 2;
                                        b4 = 1;
                                    }
                                }
                            } else {
                                charSequence = text;
                            }
                            String obj4 = charSequence.toString();
                            km5 km5Var = km5.a;
                            q80 q80Var3 = r80.a;
                            if (arrayList2.isEmpty()) {
                                km5Var.getClass();
                                arrayList = null;
                            } else {
                                km5Var.getClass();
                                arrayList = arrayList2;
                            }
                            obj3 = new q80(arrayList, obj4);
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
