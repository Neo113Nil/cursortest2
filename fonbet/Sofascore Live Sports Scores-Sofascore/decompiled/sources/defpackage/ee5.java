package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ee5 extends qhh {
    public final /* synthetic */ int m;
    public final Object n;

    public ee5(List list) {
        this.m = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        int i = ((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i2 = (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        nc3 nc3Var = new nc3();
        Paint paint = new Paint();
        nc3Var.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        nc3Var.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        nc3Var.c = new Canvas();
        nc3Var.d = new he5(719, 575, 0, 719, 0, 575);
        nc3Var.e = new fe5(0, new int[]{0, -1, -16777216, -8421505}, nc3.o(), nc3.p());
        nc3Var.f = new re5(i, i2, 0);
        this.n = nc3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qhh
    public final kli b(byte[] bArr, int i, boolean z) {
        int i2;
        List unmodifiableList;
        SparseArray sparseArray;
        int i3;
        int i4;
        Paint paint;
        int i5;
        Paint paint2;
        Canvas canvas;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int[] iArr;
        int i6;
        int[] iArr2;
        SparseArray sparseArray4;
        int i7;
        Paint paint3;
        int i8;
        ne5 ne5Var;
        int i9;
        int i10;
        int i11;
        int i12;
        l74 a;
        int i13 = this.m;
        Object obj = this.n;
        switch (i13) {
            case 0:
                nc3 nc3Var = (nc3) obj;
                if (z) {
                    re5 re5Var = (re5) nc3Var.f;
                    re5Var.c.clear();
                    re5Var.d.clear();
                    re5Var.e.clear();
                    re5Var.f.clear();
                    re5Var.g.clear();
                    re5Var.h = null;
                    re5Var.i = null;
                }
                Paint paint4 = (Paint) nc3Var.b;
                Canvas canvas2 = (Canvas) nc3Var.c;
                re5 re5Var2 = (re5) nc3Var.f;
                SparseArray sparseArray5 = re5Var2.f;
                SparseArray sparseArray6 = re5Var2.g;
                int i14 = re5Var2.b;
                SparseArray sparseArray7 = re5Var2.c;
                SparseArray sparseArray8 = re5Var2.d;
                SparseArray sparseArray9 = re5Var2.e;
                int i15 = re5Var2.a;
                nm2 nm2Var = new nm2(bArr, i, 2, (byte) 0);
                while (nm2Var.b() >= 48 && nm2Var.i(8) == 15) {
                    int i16 = nm2Var.i(8);
                    int i17 = nm2Var.i(16);
                    int i18 = nm2Var.i(16);
                    int f = nm2Var.f() + i18;
                    if (i18 * 8 > nm2Var.b()) {
                        m6k.f0();
                        nm2Var.t(nm2Var.b());
                        sparseArray4 = sparseArray6;
                        i7 = i14;
                        paint3 = paint4;
                        i8 = i15;
                    } else {
                        switch (i16) {
                            case 16:
                                sparseArray4 = sparseArray6;
                                i7 = i14;
                                paint3 = paint4;
                                if (i17 == i15) {
                                    ke5 ke5Var = (ke5) re5Var2.i;
                                    int i19 = 8;
                                    nm2Var.i(8);
                                    int i20 = nm2Var.i(4);
                                    int i21 = nm2Var.i(2);
                                    nm2Var.t(2);
                                    int i22 = i18 - 2;
                                    SparseArray sparseArray10 = new SparseArray();
                                    while (i22 > 0) {
                                        int i23 = nm2Var.i(i19);
                                        nm2Var.t(i19);
                                        sparseArray10.put(i23, new le5(nm2Var.i(16), nm2Var.i(16)));
                                        i15 = i15;
                                        i22 -= 6;
                                        i19 = 8;
                                    }
                                    i8 = i15;
                                    ke5 ke5Var2 = new ke5(i20, i21, sparseArray10);
                                    if (i21 != 0) {
                                        re5Var2.i = ke5Var2;
                                        sparseArray7.clear();
                                        sparseArray8.clear();
                                        sparseArray9.clear();
                                        break;
                                    } else if (ke5Var != null && ke5Var.a != i20) {
                                        re5Var2.i = ke5Var2;
                                        break;
                                    }
                                }
                                i8 = i15;
                                break;
                            case 17:
                                ke5 ke5Var3 = (ke5) re5Var2.i;
                                if (i17 == i15 && ke5Var3 != null) {
                                    int i24 = nm2Var.i(8);
                                    nm2Var.t(4);
                                    boolean h = nm2Var.h();
                                    nm2Var.t(3);
                                    int i25 = nm2Var.i(16);
                                    int i26 = nm2Var.i(16);
                                    nm2Var.i(3);
                                    int i27 = nm2Var.i(3);
                                    int i28 = 2;
                                    nm2Var.t(2);
                                    int i29 = nm2Var.i(8);
                                    int i30 = nm2Var.i(8);
                                    int i31 = nm2Var.i(4);
                                    int i32 = nm2Var.i(2);
                                    nm2Var.t(2);
                                    int i33 = i18 - 10;
                                    SparseArray sparseArray11 = new SparseArray();
                                    while (i33 > 0) {
                                        int i34 = i33;
                                        int i35 = i14;
                                        int i36 = nm2Var.i(16);
                                        int i37 = nm2Var.i(i28);
                                        nm2Var.i(i28);
                                        Paint paint5 = paint4;
                                        int i38 = nm2Var.i(12);
                                        SparseArray sparseArray12 = sparseArray6;
                                        nm2Var.t(4);
                                        int i39 = nm2Var.i(12);
                                        int i40 = i34 - 6;
                                        if (i37 == 1 || i37 == 2) {
                                            nm2Var.i(8);
                                            nm2Var.i(8);
                                            i33 = i34 - 8;
                                        } else {
                                            i33 = i40;
                                        }
                                        sparseArray11.put(i36, new pe5(i38, i39));
                                        i14 = i35;
                                        paint4 = paint5;
                                        sparseArray6 = sparseArray12;
                                        i28 = 2;
                                    }
                                    sparseArray4 = sparseArray6;
                                    i7 = i14;
                                    paint3 = paint4;
                                    ne5 ne5Var2 = new ne5(i24, h, i25, i26, i27, i29, i30, i31, i32, sparseArray11);
                                    if (ke5Var3.b == 0 && (ne5Var = (ne5) sparseArray7.get(i24)) != null) {
                                        SparseArray sparseArray13 = ne5Var.j;
                                        for (int i41 = 0; i41 < sparseArray13.size(); i41++) {
                                            ne5Var2.j.put(sparseArray13.keyAt(i41), (pe5) sparseArray13.valueAt(i41));
                                        }
                                    }
                                    sparseArray7.put(ne5Var2.a, ne5Var2);
                                    i8 = i15;
                                    break;
                                }
                                sparseArray4 = sparseArray6;
                                i7 = i14;
                                paint3 = paint4;
                                i8 = i15;
                                break;
                            case 18:
                                if (i17 == i15) {
                                    fe5 s = nc3.s(nm2Var, i18);
                                    sparseArray8.put(s.a, s);
                                } else if (i17 == i14) {
                                    fe5 s2 = nc3.s(nm2Var, i18);
                                    sparseArray5.put(s2.a, s2);
                                }
                                sparseArray4 = sparseArray6;
                                i7 = i14;
                                paint3 = paint4;
                                i8 = i15;
                                break;
                            case 19:
                                if (i17 == i15) {
                                    ie5 t = nc3.t(nm2Var);
                                    sparseArray9.put(t.a, t);
                                } else if (i17 == i14) {
                                    ie5 t2 = nc3.t(nm2Var);
                                    sparseArray6.put(t2.a, t2);
                                }
                                sparseArray4 = sparseArray6;
                                i7 = i14;
                                paint3 = paint4;
                                i8 = i15;
                                break;
                            case 20:
                                if (i17 == i15) {
                                    nm2Var.t(4);
                                    boolean h2 = nm2Var.h();
                                    nm2Var.t(3);
                                    int i42 = nm2Var.i(16);
                                    int i43 = nm2Var.i(16);
                                    if (h2) {
                                        int i44 = nm2Var.i(16);
                                        int i45 = nm2Var.i(16);
                                        int i46 = nm2Var.i(16);
                                        i11 = i44;
                                        i10 = nm2Var.i(16);
                                        i9 = i45;
                                        i12 = i46;
                                    } else {
                                        i9 = i42;
                                        i10 = i43;
                                        i11 = 0;
                                        i12 = 0;
                                    }
                                    re5Var2.h = new he5(i42, i43, i11, i9, i12, i10);
                                }
                                sparseArray4 = sparseArray6;
                                i7 = i14;
                                paint3 = paint4;
                                i8 = i15;
                                break;
                            default:
                                sparseArray4 = sparseArray6;
                                i7 = i14;
                                paint3 = paint4;
                                i8 = i15;
                                break;
                        }
                        nm2Var.u(f - nm2Var.f());
                    }
                    i15 = i8;
                    i14 = i7;
                    paint4 = paint3;
                    sparseArray6 = sparseArray4;
                }
                SparseArray sparseArray14 = sparseArray6;
                Paint paint6 = paint4;
                ke5 ke5Var4 = (ke5) re5Var2.i;
                if (ke5Var4 == null) {
                    unmodifiableList = Collections.EMPTY_LIST;
                    i2 = 0;
                } else {
                    he5 he5Var = (he5) re5Var2.h;
                    if (he5Var == null) {
                        he5Var = (he5) nc3Var.d;
                    }
                    int i47 = he5Var.b;
                    int i48 = he5Var.a;
                    Bitmap bitmap = (Bitmap) nc3Var.g;
                    if (bitmap == null || i48 + 1 != bitmap.getWidth() || i47 + 1 != ((Bitmap) nc3Var.g).getHeight()) {
                        Bitmap createBitmap = Bitmap.createBitmap(i48 + 1, i47 + 1, Bitmap.Config.ARGB_8888);
                        nc3Var.g = createBitmap;
                        canvas2.setBitmap(createBitmap);
                    }
                    ArrayList arrayList = new ArrayList();
                    SparseArray sparseArray15 = ke5Var4.c;
                    int i49 = 0;
                    while (i49 < sparseArray15.size()) {
                        canvas2.save();
                        le5 le5Var = (le5) sparseArray15.valueAt(i49);
                        ne5 ne5Var3 = (ne5) sparseArray7.get(sparseArray15.keyAt(i49));
                        int i50 = le5Var.a + he5Var.c;
                        int i51 = le5Var.b + he5Var.e;
                        int i52 = ne5Var3.c;
                        SparseArray sparseArray16 = sparseArray15;
                        int i53 = ne5Var3.f;
                        int i54 = i49;
                        int i55 = ne5Var3.d;
                        SparseArray sparseArray17 = sparseArray7;
                        int i56 = i50 + i52;
                        int i57 = i52;
                        ArrayList arrayList2 = arrayList;
                        int i58 = i51 + i55;
                        int i59 = i47;
                        canvas2.clipRect(i50, i51, Math.min(i56, he5Var.d), Math.min(i58, he5Var.f));
                        fe5 fe5Var = (fe5) sparseArray8.get(i53);
                        if (fe5Var == null && (fe5Var = (fe5) sparseArray5.get(i53)) == null) {
                            fe5Var = (fe5) nc3Var.e;
                        }
                        int[] iArr3 = fe5Var.b;
                        int[] iArr4 = fe5Var.c;
                        int[] iArr5 = fe5Var.d;
                        SparseArray sparseArray18 = ne5Var3.j;
                        he5 he5Var2 = he5Var;
                        int i60 = 0;
                        while (i60 < sparseArray18.size()) {
                            int keyAt = sparseArray18.keyAt(i60);
                            SparseArray sparseArray19 = sparseArray18;
                            pe5 pe5Var = (pe5) sparseArray18.valueAt(i60);
                            ie5 ie5Var = (ie5) sparseArray9.get(keyAt);
                            int i61 = i60;
                            SparseArray sparseArray20 = sparseArray14;
                            if (ie5Var == null) {
                                ie5Var = (ie5) sparseArray20.get(keyAt);
                            }
                            ie5 ie5Var2 = ie5Var;
                            sparseArray14 = sparseArray20;
                            if (ie5Var2 != null) {
                                Paint paint7 = ie5Var2.b ? null : (Paint) nc3Var.a;
                                int[] iArr6 = iArr4;
                                int i62 = ne5Var3.e;
                                int i63 = pe5Var.a + i50;
                                int i64 = pe5Var.b + i51;
                                if (i62 == 3) {
                                    sparseArray2 = sparseArray8;
                                    sparseArray3 = sparseArray9;
                                    iArr2 = iArr5;
                                } else if (i62 == 2) {
                                    sparseArray2 = sparseArray8;
                                    sparseArray3 = sparseArray9;
                                    iArr2 = iArr6;
                                } else {
                                    sparseArray2 = sparseArray8;
                                    sparseArray3 = sparseArray9;
                                    iArr2 = iArr3;
                                }
                                i6 = i57;
                                canvas = canvas2;
                                iArr = iArr6;
                                nc3.r(ie5Var2.c, iArr2, i62, i63, i64, paint7, canvas);
                                nc3.r(ie5Var2.d, iArr2, i62, i63, i64 + 1, paint7, canvas);
                            } else {
                                canvas = canvas2;
                                sparseArray2 = sparseArray8;
                                sparseArray3 = sparseArray9;
                                iArr = iArr4;
                                i6 = i57;
                            }
                            sparseArray9 = sparseArray3;
                            i57 = i6;
                            iArr4 = iArr;
                            i60 = i61 + 1;
                            canvas2 = canvas;
                            sparseArray18 = sparseArray19;
                            sparseArray8 = sparseArray2;
                        }
                        Canvas canvas3 = canvas2;
                        SparseArray sparseArray21 = sparseArray8;
                        SparseArray sparseArray22 = sparseArray9;
                        int[] iArr7 = iArr4;
                        int i65 = i57;
                        if (ne5Var3.b) {
                            int i66 = ne5Var3.e;
                            if (i66 == 3) {
                                i5 = iArr5[ne5Var3.g];
                                paint2 = paint6;
                            } else {
                                i5 = i66 == 2 ? iArr7[ne5Var3.h] : iArr3[ne5Var3.i];
                                paint2 = paint6;
                            }
                            paint2.setColor(i5);
                            float f2 = i58;
                            i3 = i51;
                            i4 = i50;
                            paint = paint2;
                            sparseArray = sparseArray5;
                            canvas2 = canvas3;
                            canvas2.drawRect(i50, i51, i56, f2, paint);
                        } else {
                            sparseArray = sparseArray5;
                            i3 = i51;
                            i4 = i50;
                            canvas2 = canvas3;
                            paint = paint6;
                        }
                        float f3 = i48;
                        float f4 = i59;
                        arrayList2.add(new l74(null, null, null, Bitmap.createBitmap((Bitmap) nc3Var.g, i4, i3, i65, i55), i3 / f4, 0, 0, i4 / f3, 0, Integer.MIN_VALUE, -3.4028235E38f, i65 / f3, i55 / f4, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas2.restore();
                        sparseArray9 = sparseArray22;
                        i49 = i54 + 1;
                        i47 = i59;
                        paint6 = paint;
                        sparseArray15 = sparseArray16;
                        sparseArray7 = sparseArray17;
                        sparseArray8 = sparseArray21;
                        sparseArray5 = sparseArray;
                        arrayList = arrayList2;
                        he5Var = he5Var2;
                    }
                    i2 = 0;
                    unmodifiableList = Collections.unmodifiableList(arrayList);
                }
                return new se5(unmodifiableList, i2);
            default:
                nkk nkkVar = (nkk) obj;
                nkkVar.C(bArr, i);
                ArrayList arrayList3 = new ArrayList();
                while (nkkVar.c() > 0) {
                    if (nkkVar.c() < 8) {
                        throw new oli("Incomplete Mp4Webvtt Top Level box header found.");
                    }
                    int f5 = nkkVar.f();
                    if (nkkVar.f() == 1987343459) {
                        int i67 = f5 - 8;
                        CharSequence charSequence = null;
                        j74 j74Var = null;
                        while (i67 > 0) {
                            if (i67 < 8) {
                                throw new oli("Incomplete vtt cue box header found.");
                            }
                            int f6 = nkkVar.f();
                            int f7 = nkkVar.f();
                            int i68 = f6 - 8;
                            byte[] bArr2 = nkkVar.a;
                            int i69 = nkkVar.b;
                            int i70 = lik.a;
                            String str = new String(bArr2, i69, i68, xp2.c);
                            nkkVar.F(i68);
                            i67 = (i67 - 8) - i68;
                            if (f7 == 1937011815) {
                                d2l d2lVar = new d2l();
                                e2l.e(str, d2lVar);
                                j74Var = d2lVar.a();
                            } else if (f7 == 1885436268) {
                                charSequence = e2l.f(null, str.trim(), Collections.EMPTY_LIST);
                            }
                        }
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (j74Var != null) {
                            j74Var.a = charSequence;
                            a = j74Var.a();
                        } else {
                            Pattern pattern = e2l.a;
                            d2l d2lVar2 = new d2l();
                            d2lVar2.c = charSequence;
                            a = d2lVar2.a().a();
                        }
                        arrayList3.add(a);
                    } else {
                        nkkVar.F(f5 - 8);
                    }
                }
                return new se5(arrayList3);
        }
    }

    public ee5() {
        this.m = 1;
        this.n = new nkk(4, false);
    }
}
