package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.u0;
import com.google.android.gms.common.internal.v0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes2.dex */
public abstract class z extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32822a;

    public z(byte[] bArr) {
        AbstractC3191o.a(bArr.length == 25);
        this.f32822a = Arrays.hashCode(bArr);
    }

    public static byte[] i(String str) {
        try {
            return str.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        N9.b zzd;
        if (!(obj instanceof v0)) {
            return false;
        }
        try {
            v0 v0Var = (v0) obj;
            if (v0Var.zze() == this.f32822a && (zzd = v0Var.zzd()) != null) {
                return Arrays.equals(g(), (byte[]) N9.d.g(zzd));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.f32822a;
    }

    @Override // com.google.android.gms.common.internal.v0
    public final N9.b zzd() {
        return N9.d.i(g());
    }

    @Override // com.google.android.gms.common.internal.v0
    public final int zze() {
        return this.f32822a;
    }
}
