package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;
import f9.AbstractC6467a;
import f9.i;
import f9.l;
import f9.m;

/* loaded from: classes9.dex */
final class a extends zbnz {

    /* renamed from: e, reason: collision with root package name */
    private final Context f60081e;

    /* renamed from: f, reason: collision with root package name */
    private final String f60082f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f60083g;

    /* renamed from: h, reason: collision with root package name */
    private final String f60084h;

    /* renamed from: i, reason: collision with root package name */
    private final String f60085i;

    /* renamed from: j, reason: collision with root package name */
    private i f60086j;

    a(Context context, String str, String str2, String str3, boolean z11) {
        this.f60081e = context;
        this.f60082f = str;
        this.f60084h = str2;
        this.f60085i = str3;
        this.f60083g = z11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final zbok zbb(IObjectWrapper iObjectWrapper, zbnx zbnxVar) throws RemoteException {
        i iVar = this.f60086j;
        if (iVar == null) {
            throw new RemoteException("Process is started without initiation.");
        }
        l b11 = ((i) Preconditions.checkNotNull(iVar)).b(iObjectWrapper, zbnxVar);
        m c11 = b11.c();
        if (c11.b().zbc()) {
            throw ((RemoteException) c11.b().zba());
        }
        return b11.b();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final void zbc() throws RemoteException {
        if (this.f60086j == null) {
            System.loadLibrary("mlkit_google_ocr_pipeline");
            String str = this.f60085i;
            if (str == null || str.isEmpty()) {
                str = "";
            }
            AbstractC6467a.AbstractC1006a a11 = AbstractC6467a.a(this.f60082f, this.f60084h, str);
            a11.b(this.f60083g);
            i a12 = i.a(this.f60081e, a11.a());
            this.f60086j = a12;
            m c11 = a12.c();
            if (c11.b().zbc()) {
                throw ((RemoteException) c11.b().zba());
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final void zbd() {
        i iVar = this.f60086j;
        if (iVar != null) {
            iVar.d();
            this.f60086j = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final zbf[] zbe(IObjectWrapper iObjectWrapper, zbnx zbnxVar) throws RemoteException {
        throw new RemoteException("#recognizeBitmap should not be triggered from text thick client.");
    }
}
