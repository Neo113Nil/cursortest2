package ru.ozon.android.messenger.blocks.messagefile;

import C.o0;
import Kk.C3532b;
import c8.C5766e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.i;
import ru.ozon.android.messenger.framework.presentation.models.j;

/* loaded from: classes10.dex */
public final class c implements ru.ozon.android.messenger.framework.presentation.models.g, j, i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85693a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f85694b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85695c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f85696d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f85697e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f85698f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f85699g;

    /* renamed from: h, reason: collision with root package name */
    private String f85700h;

    /* renamed from: i, reason: collision with root package name */
    private String f85701i;

    public c(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String url, String str, @NotNull String name, @NotNull String mime, @NotNull String size, boolean z11, String str2, String str3) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f85693a = blockId;
        this.f85694b = url;
        this.f85695c = str;
        this.f85696d = name;
        this.f85697e = mime;
        this.f85698f = size;
        this.f85699g = z11;
        this.f85700h = str2;
        this.f85701i = str3;
    }

    public static c c(c cVar, String str, String str2, boolean z11, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar.f85693a;
        if ((i11 & 2) != 0) {
            str = cVar.f85694b;
        }
        String url = str;
        if ((i11 & 4) != 0) {
            str2 = cVar.f85695c;
        }
        String str3 = str2;
        String name = cVar.f85696d;
        String mime = cVar.f85697e;
        String size = cVar.f85698f;
        if ((i11 & 64) != 0) {
            z11 = cVar.f85699g;
        }
        String str4 = cVar.f85700h;
        String str5 = cVar.f85701i;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(size, "size");
        return new c(blockId, url, str3, name, mime, size, z11, str4, str5);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.i
    public final String a() {
        return this.f85701i;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.i
    public final void b(String str) {
        this.f85701i = str;
    }

    public final boolean d() {
        return this.f85699g;
    }

    public final String e() {
        return this.f85695c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f85693a, cVar.f85693a) && Intrinsics.d(this.f85694b, cVar.f85694b) && Intrinsics.d(this.f85695c, cVar.f85695c) && Intrinsics.d(this.f85696d, cVar.f85696d) && Intrinsics.d(this.f85697e, cVar.f85697e) && Intrinsics.d(this.f85698f, cVar.f85698f) && this.f85699g == cVar.f85699g && Intrinsics.d(this.f85700h, cVar.f85700h) && Intrinsics.d(this.f85701i, cVar.f85701i);
    }

    @NotNull
    public final String f() {
        return this.f85697e;
    }

    @NotNull
    public final String g() {
        return this.f85696d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85693a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f85700h;
    }

    @NotNull
    public final String h() {
        return this.f85698f;
    }

    public final int hashCode() {
        int a11 = G.g.a(this.f85693a.hashCode() * 31, 31, this.f85694b);
        String str = this.f85695c;
        int a12 = C3532b.a(G.g.a(G.g.a(G.g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85696d), 31, this.f85697e), 31, this.f85698f), 31, this.f85699g);
        String str2 = this.f85700h;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85701i;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.f85694b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f85700h = str;
    }

    @NotNull
    public final String toString() {
        String str = this.f85700h;
        String str2 = this.f85701i;
        StringBuilder sb2 = new StringBuilder("FileVO(blockId=");
        sb2.append(this.f85693a);
        sb2.append(", url=");
        sb2.append(this.f85694b);
        sb2.append(", localUrl=");
        sb2.append(this.f85695c);
        sb2.append(", name=");
        sb2.append(this.f85696d);
        sb2.append(", mime=");
        sb2.append(this.f85697e);
        sb2.append(", size=");
        sb2.append(this.f85698f);
        sb2.append(", hasPermissionForFile=");
        C5766e.a(", sendTime=", str, ", author=", sb2, this.f85699g);
        return o0.c(sb2, str2, ")");
    }
}
