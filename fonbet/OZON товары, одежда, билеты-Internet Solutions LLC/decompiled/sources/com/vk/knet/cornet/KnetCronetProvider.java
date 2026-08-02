package com.vk.knet.cornet;

import Wa.e;
import android.content.Context;
import com.vk.knet.cornet.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.AbstractC8761e;
import org.chromium.net.i;
import org.chromium.net.impl.NativeCronetProvider;
import org.chromium.net.impl.V;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/vk/knet/cornet/KnetCronetProvider;", "Lorg/chromium/net/impl/NativeCronetProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lorg/chromium/net/e$a;", "createBuilder", "()Lorg/chromium/net/e$a;", "", "getName", "()Ljava/lang/String;", "", "isEnabled", "()Z", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "cronet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KnetCronetProvider extends NativeCronetProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnetCronetProvider(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        e.a(b.a.CLIENT_BUILDER, "Initialization KnetCronetProvider");
    }

    @Override // org.chromium.net.impl.NativeCronetProvider, org.chromium.net.g
    @NotNull
    public AbstractC8761e.a createBuilder() {
        e.a(b.a.CLIENT_BUILDER, "Create engine builder by KnetCronetProvider");
        return new i.a(new V(this.mContext));
    }

    @Override // org.chromium.net.impl.NativeCronetProvider
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof KnetCronetProvider) && Intrinsics.d(this.mContext, ((KnetCronetProvider) other).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.impl.NativeCronetProvider, org.chromium.net.g
    @NotNull
    public String getName() {
        return "Knet-App-Packaged-Cronet-Provider";
    }

    @Override // org.chromium.net.impl.NativeCronetProvider
    public int hashCode() {
        return Arrays.hashCode(new Object[]{KnetCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.impl.NativeCronetProvider, org.chromium.net.g
    public boolean isEnabled() {
        return true;
    }
}
