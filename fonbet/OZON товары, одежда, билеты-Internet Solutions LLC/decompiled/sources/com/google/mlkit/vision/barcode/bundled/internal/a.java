package com.google.mlkit.vision.barcode.bundled.internal;

import N7.b;
import N7.c;
import N7.d;
import N7.e;
import N7.f;
import N7.g;
import N7.h;
import N7.i;
import N7.j;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g9.C6669a;
import g9.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
final class a extends zzbm {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f60074h = {5, 7, 7, 7, 5, 5};

    /* renamed from: i, reason: collision with root package name */
    private static final double[][] f60075i = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: e, reason: collision with root package name */
    private final Context f60076e;

    /* renamed from: f, reason: collision with root package name */
    private final zzba f60077f;

    /* renamed from: g, reason: collision with root package name */
    private BarhopperV3 f60078g;

    a(Context context, zzba zzbaVar) {
        this.f60076e = context;
        this.f60077f = zzbaVar;
    }

    private static zzan H(x xVar, String str, String str2) {
        if (xVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzan(xVar.d(), xVar.zzd(), xVar.a(), xVar.b(), xVar.zzc(), xVar.c(), xVar.g(), matcher.find() ? matcher.group(1) : null);
    }

    private final C6669a I(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f60078g);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.d(zzccVar.zzd(), zzccVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.j(zzccVar.zzd(), zzccVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.j(zzccVar.zzd(), zzccVar.zza(), bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    private final java.util.ArrayList J(com.google.android.gms.dynamic.IObjectWrapper r48, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc r49, com.google.android.libraries.barhopper.RecognitionOptions r50) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.bundled.internal.a.J(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc, com.google.android.libraries.barhopper.RecognitionOptions):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzb(IObjectWrapper iObjectWrapper, zzcc zzccVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.f60077f;
        recognitionOptions.a(zzbaVar.zza());
        recognitionOptions.f(zzbaVar.zzb());
        recognitionOptions.b();
        recognitionOptions.c();
        return J(iObjectWrapper, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzc(IObjectWrapper iObjectWrapper, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.f60077f;
        recognitionOptions.a(zzbaVar.zza());
        recognitionOptions.f(zzbaVar.zzb());
        recognitionOptions.b();
        recognitionOptions.c();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(zzbcVar.zza().zzc());
        multiScaleDecodingOptions.b(zzbcVar.zza().zza());
        multiScaleDecodingOptions.c(zzbcVar.zza().zzb());
        recognitionOptions.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(zzbcVar.zza().zzc());
        recognitionOptions.e(multiScaleDetectionOptions);
        recognitionOptions.g(zzbcVar.zzb());
        return J(iObjectWrapper, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzd() {
        Context context = this.f60076e;
        if (this.f60078g != null) {
            return;
        }
        this.f60078g = new BarhopperV3();
        h a11 = i.a();
        f a12 = g.a();
        int i11 = 16;
        int i12 = 0;
        for (int i13 = 0; i13 < 6; i13++) {
            d a13 = e.a();
            a13.c(i11);
            a13.d(i11);
            for (int i14 = 0; i14 < f60074h[i13]; i14++) {
                double[] dArr = f60075i[i12];
                double d11 = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f7 = (float) d11;
                a13.a(f7 / sqrt);
                a13.b(f7 * sqrt);
                i12++;
            }
            i11 += i11;
            a12.a(a13);
        }
        a11.a(a12);
        try {
            InputStream open = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f60078g);
                        j a14 = N7.a.a();
                        a11.b(zzdf.zzs(open));
                        a14.a(a11);
                        b a15 = c.a();
                        a15.a(zzdf.zzs(open2));
                        a15.b(zzdf.zzs(open3));
                        a14.b(a15);
                        barhopperV3.c(a14.zzj());
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e11) {
            throw new IllegalStateException("Failed to open Barcode models", e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.f60078g;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f60078g = null;
        }
    }
}
