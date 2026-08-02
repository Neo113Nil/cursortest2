package f9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b9.C5588c;
import b9.C5589d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbb;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbe;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbiu;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpk;
import com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import h7.C6825b0;
import h7.C6829d0;
import h7.C6833f0;
import h7.C6851o0;
import h7.C6856r0;
import h7.L;
import h7.N;
import h7.U0;
import h7.V0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f63004a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6467a f63005b;

    /* renamed from: c, reason: collision with root package name */
    h f63006c;

    /* renamed from: d, reason: collision with root package name */
    boolean f63007d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f63008e = true;

    private i(Context context, AbstractC6467a abstractC6467a) {
        this.f63004a = context;
        this.f63005b = abstractC6467a;
    }

    public static i a(Context context, AbstractC6467a abstractC6467a) {
        return new i(context, abstractC6467a);
    }

    public final l b(IObjectWrapper iObjectWrapper, zbnx zbnxVar) {
        zbki b11;
        zbku zbkuVar;
        zbku zbkuVar2;
        zbku zbkuVar3;
        m c11 = c();
        if (c11.b().zbc()) {
            return l.e(c11);
        }
        try {
            int i11 = 1;
            if (zbnxVar.zbb() == -1) {
                Log.d("PipelineManager", "Start process bitmap");
                Bitmap bitmap = (Bitmap) Preconditions.checkNotNull((Bitmap) ObjectWrapper.unwrap(iObjectWrapper));
                Bitmap.Config config = bitmap.getConfig();
                Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                if (config != config2) {
                    Log.d("PipelineManager", "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                    bitmap = bitmap.copy(config2, bitmap.isMutable());
                }
                h hVar = (h) Preconditions.checkNotNull(this.f63006c);
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                int zbc = zbnxVar.zbc();
                b11 = hVar.f(elapsedRealtime, bitmap, zbc != 1 ? zbc != 2 ? zbc != 3 ? 1 : 2 : 3 : 4);
            } else if (zbnxVar.zbb() == 35) {
                Log.d("PipelineManager", "Start process YUV");
                Image.Plane[] planes = ((Image) Preconditions.checkNotNull(ObjectWrapper.unwrap(iObjectWrapper))).getPlanes();
                h hVar2 = (h) Preconditions.checkNotNull(this.f63006c);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() * 1000;
                ByteBuffer buffer = ((Image.Plane) Preconditions.checkNotNull(planes[0])).getBuffer();
                ByteBuffer buffer2 = ((Image.Plane) Preconditions.checkNotNull(planes[1])).getBuffer();
                ByteBuffer buffer3 = ((Image.Plane) Preconditions.checkNotNull(planes[2])).getBuffer();
                int zbd = zbnxVar.zbd();
                int zba = zbnxVar.zba();
                int rowStride = ((Image.Plane) Preconditions.checkNotNull(planes[0])).getRowStride();
                int rowStride2 = ((Image.Plane) Preconditions.checkNotNull(planes[1])).getRowStride();
                int pixelStride = ((Image.Plane) Preconditions.checkNotNull(planes[1])).getPixelStride();
                int zbc2 = zbnxVar.zbc();
                b11 = hVar2.g(elapsedRealtime2, buffer, buffer2, buffer3, zbd, zba, rowStride, rowStride2, pixelStride, zbc2 != 1 ? zbc2 != 2 ? zbc2 != 3 ? 1 : 2 : 3 : 4);
            } else if (zbnxVar.zbb() == 17) {
                Log.d("PipelineManager", "Start process NV21");
                ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper));
                if (!byteBuffer.hasArray()) {
                    byteBuffer.rewind();
                    byte[] bArr = new byte[byteBuffer.limit()];
                    byteBuffer.get(bArr);
                    byteBuffer = ByteBuffer.wrap(bArr);
                }
                b11 = ((h) Preconditions.checkNotNull(this.f63006c)).b(j.a(byteBuffer, zbnxVar));
            } else {
                if (zbnxVar.zbb() != 842094169) {
                    throw new R8.a("Unsupported image format: " + zbnxVar.zbb(), 3);
                }
                Log.d("PipelineManager", "Start process YV12");
                b11 = ((h) Preconditions.checkNotNull(this.f63006c)).b(j.a(C5588c.e((ByteBuffer) Preconditions.checkNotNull(ObjectWrapper.unwrap(iObjectWrapper)), true), zbnxVar));
            }
            if (!b11.zbc()) {
                return l.e(new c(3, zbki.zbe(new RemoteException("VisionKit pipeline returns empty result."))));
            }
            Log.d("PipelineManager", "OCR process succeeded via visionkit pipeline.");
            C6833f0 c6833f0 = (C6833f0) b11.zba();
            C5589d b12 = C5589d.b();
            int zbd2 = zbnxVar.zbd();
            int zba2 = zbnxVar.zba();
            int zbc3 = zbnxVar.zbc();
            b12.getClass();
            Matrix d11 = C5589d.d(zbd2, zba2, zbc3);
            boolean z11 = this.f63008e;
            c cVar = new c(0, zbki.zbd());
            List<zbabj> zbf = c6833f0.zbe().zbf();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            for (zbabj zbabjVar : zbf) {
                if (zbabjVar.zbI() == 6) {
                    zbpb b13 = f.b(zbabjVar.zbf());
                    List c12 = f.c(b13);
                    zboo zbooVar = new zboo(zbabjVar.zbH(), f.a(c12, d11), c12, zbabjVar.zbc(), b13.zba());
                    Integer valueOf = Integer.valueOf(zbabjVar.zbe());
                    if (hashMap2.containsKey(valueOf)) {
                        zbkuVar3 = (zbku) hashMap2.get(valueOf);
                    } else {
                        zbku zbkuVar4 = new zbku();
                        hashMap2.put(valueOf, zbkuVar4);
                        zbkuVar3 = zbkuVar4;
                    }
                    ((zbku) Preconditions.checkNotNull(zbkuVar3)).zba(zbooVar);
                }
            }
            int i12 = 0;
            while (i12 < zbf.size()) {
                zbabj zbabjVar2 = (zbabj) zbf.get(i12);
                if (zbabjVar2.zbI() == i11) {
                    zbpb b14 = f.b(zbabjVar2.zbf());
                    List c13 = f.c(b14);
                    Integer valueOf2 = Integer.valueOf(i12);
                    zbog zbogVar = new zbog(zbabjVar2.zbH(), f.a(c13, d11), c13, g.a(zbabjVar2.zbh().zbf()), zbabjVar2.zbc(), b14.zba(), (List) Preconditions.checkNotNull(hashMap2.containsKey(valueOf2) ? ((zbku) Preconditions.checkNotNull((zbku) hashMap2.get(valueOf2))).zbb() : zbkx.zbh()));
                    Integer valueOf3 = Integer.valueOf(zbabjVar2.zbe());
                    if (hashMap.containsKey(valueOf3)) {
                        zbkuVar2 = (zbku) hashMap.get(valueOf3);
                    } else {
                        zbku zbkuVar5 = new zbku();
                        hashMap.put(valueOf3, zbkuVar5);
                        zbkuVar2 = zbkuVar5;
                    }
                    ((zbku) Preconditions.checkNotNull(zbkuVar2)).zba(zbogVar);
                }
                i12++;
                i11 = 1;
            }
            for (int i13 = 0; i13 < zbf.size(); i13++) {
                zbabj zbabjVar3 = (zbabj) zbf.get(i13);
                if (zbabjVar3.zbI() == 3) {
                    zbpb b15 = f.b(zbabjVar3.zbf());
                    List c14 = f.c(b15);
                    Integer valueOf4 = Integer.valueOf(i13);
                    zboi zboiVar = new zboi(zbabjVar3.zbH(), f.a(c14, d11), c14, g.a(zbabjVar3.zbh().zbf()), (List) Preconditions.checkNotNull(hashMap.containsKey(valueOf4) ? ((zbku) Preconditions.checkNotNull((zbku) hashMap.get(valueOf4))).zbb() : zbkx.zbh()), zbabjVar3.zbc(), b15.zba());
                    Integer valueOf5 = Integer.valueOf(zbabjVar3.zbe());
                    if (hashMap3.containsKey(valueOf5)) {
                        zbkuVar = (zbku) hashMap3.get(valueOf5);
                    } else {
                        zbku zbkuVar6 = new zbku();
                        hashMap3.put(Integer.valueOf(zbabjVar3.zbe()), zbkuVar6);
                        zbkuVar = zbkuVar6;
                    }
                    ((zbku) Preconditions.checkNotNull(zbkuVar)).zba(zboiVar);
                }
            }
            zbku zbkuVar7 = new zbku();
            for (int i14 = 0; i14 < zbf.size(); i14++) {
                zbabj zbabjVar4 = (zbabj) zbf.get(i14);
                if (zbabjVar4.zbI() == 4) {
                    List c15 = f.c(f.b(zbabjVar4.zbf()));
                    zbkx zbh = zbkx.zbh();
                    Integer valueOf6 = Integer.valueOf(i14);
                    if (hashMap3.containsKey(valueOf6)) {
                        zbh = ((zbku) Preconditions.checkNotNull((zbku) hashMap3.get(valueOf6))).zbb();
                        hashMap3.remove(valueOf6);
                    }
                    zbkuVar7.zba(new zboe(k.f63009a.zbb(zblc.zba(zbh, new Ql0.h())), f.a(c15, d11), c15, g.a(zbabjVar4.zbh().zbf()), (List) Preconditions.checkNotNull(zbh)));
                }
            }
            Iterator it = hashMap3.values().iterator();
            while (it.hasNext()) {
                zbkx zbb = ((zbku) it.next()).zbb();
                int size = zbb.size();
                for (int i15 = 0; i15 < size; i15++) {
                    zboi zboiVar2 = (zboi) zbb.get(i15);
                    zbkuVar7.zba(new zboe(zboiVar2.zbc(), zboiVar2.zba(), zboiVar2.zbd(), zboiVar2.zbb(), zbkx.zbi(zboiVar2)));
                }
            }
            zbkx zbb2 = zbkuVar7.zbb();
            C6468b c6468b = new C6468b(cVar, new zbok(k.f63009a.zbb(zblc.zba(zbb2, new Ql0.i())), zbb2), zbkx.zbh(), z11);
            this.f63008e = false;
            return c6468b;
        } catch (R8.a e11) {
            return l.e(new c(2, zbki.zbe(new RemoteException("Failed to process input image.".concat(String.valueOf(e11.getMessage()))))));
        }
    }

    public final m c() {
        if (this.f63007d) {
            return new c(0, zbki.zbd());
        }
        if (this.f63006c == null) {
            if (!AndroidAssetUtil.a(this.f63004a)) {
                Log.d("PipelineManager", "Failed to initiate native asset manager.");
            }
            AbstractC6467a abstractC6467a = this.f63005b;
            String b11 = abstractC6467a.b();
            String d11 = abstractC6467a.d();
            String c11 = abstractC6467a.c();
            boolean e11 = abstractC6467a.e();
            L b12 = N.b();
            int i11 = 4;
            char c12 = e11 ? (char) 4 : (char) 0;
            C6851o0 a11 = C6856r0.a();
            zbbb zba = zbbe.zba();
            zba.zbd(d11);
            zba.zba(b11);
            zba.zbe(true);
            zba.zbb(true);
            if (!c11.isEmpty()) {
                zbpf zba2 = zbpg.zba();
                zbpi zba3 = zbpk.zba();
                zba3.zba(c11);
                zba2.zba(zba3);
                zba.zbc(zba2);
            }
            a11.b(zba);
            if (c12 == 0) {
                i11 = 1;
            } else if (c12 == 1) {
                i11 = 2;
            } else if (c12 == 2) {
                i11 = 3;
            } else if (c12 != 3) {
                i11 = c12 != 4 ? 0 : 5;
            }
            C6825b0 a12 = C6829d0.a();
            a12.a(i11);
            a11.c(a12);
            zbiu zba4 = zbix.zba();
            zba4.zba("PassThroughCoarseClassifier");
            a11.a(zba4);
            b12.a(a11);
            U0 a13 = V0.a();
            a13.a();
            b12.b(a13);
            this.f63006c = new h((N) b12.zbk());
        }
        try {
            ((h) Preconditions.checkNotNull(this.f63006c)).d();
            this.f63007d = true;
            return new c(0, zbki.zbd());
        } catch (PipelineException e12) {
            return new c(1, zbki.zbe(new RemoteException("Failed to initialize detector. ".concat((String) e12.getRootCauseMessage().zbb("")))));
        }
    }

    public final void d() {
        h hVar = this.f63006c;
        if (hVar != null) {
            if (this.f63007d) {
                hVar.e();
            }
            this.f63006c.c();
            this.f63006c = null;
        }
        this.f63007d = false;
        this.f63008e = true;
    }
}
