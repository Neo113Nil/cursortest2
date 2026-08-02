package ru.ozon.android.messenger.framework.presentation.chatdetail;

import Kk.C3532b;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f89820a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89821b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89822c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f89823d;

    public i(Uri deeplink, String str, String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f89820a = deeplink;
        this.f89821b = str;
        this.f89822c = str2;
        this.f89823d = z11;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final String a() {
        return this.f89821b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final boolean b() {
        return this.f89823d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final boolean c() {
        return true;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final String d() {
        return this.f89822c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f89820a.equals(iVar.f89820a) && Intrinsics.d(this.f89821b, iVar.f89821b) && Intrinsics.d(this.f89822c, iVar.f89822c) && this.f89823d == iVar.f89823d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    @NotNull
    public final Uri getDeeplink() {
        return this.f89820a;
    }

    public final int hashCode() {
        int hashCode = this.f89820a.hashCode() * 31;
        String str = this.f89821b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89822c;
        return Boolean.hashCode(true) + C3532b.a((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f89823d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatScreenArgs(deeplink=");
        sb2.append(this.f89820a);
        sb2.append(", chatId=");
        sb2.append(this.f89821b);
        sb2.append(", firstUnreadMsgId=");
        sb2.append(this.f89822c);
        sb2.append(", isForceScroll=");
        return Pk0.a.a(", withDateAndUnreadWidgets=true)", sb2, this.f89823d);
    }
}
