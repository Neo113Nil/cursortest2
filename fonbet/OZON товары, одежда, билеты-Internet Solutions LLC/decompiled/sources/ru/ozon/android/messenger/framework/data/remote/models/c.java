package ru.ozon.android.messenger.framework.data.remote.models;

import G.g;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87815a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f87816b;

    /* renamed from: c, reason: collision with root package name */
    private final long f87817c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f87818d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ComposedMessageInfo f87819e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f87820f;

    /* renamed from: g, reason: collision with root package name */
    private final String f87821g;

    /* renamed from: h, reason: collision with root package name */
    private final BlockDTO f87822h;

    public c(@NotNull String chatId, @NotNull String localId, long j11, @NotNull y0 messageTypeData, @NotNull ComposedMessageInfo composedMessageInfo, boolean z11, String str, BlockDTO blockDTO) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(localId, "localId");
        Intrinsics.checkNotNullParameter(messageTypeData, "messageTypeData");
        Intrinsics.checkNotNullParameter(composedMessageInfo, "composedMessageInfo");
        this.f87815a = chatId;
        this.f87816b = localId;
        this.f87817c = j11;
        this.f87818d = messageTypeData;
        this.f87819e = composedMessageInfo;
        this.f87820f = z11;
        this.f87821g = str;
        this.f87822h = blockDTO;
    }

    public static c a(c cVar, y0 messageTypeData) {
        String chatId = cVar.f87815a;
        String localId = cVar.f87816b;
        long j11 = cVar.f87817c;
        ComposedMessageInfo composedMessageInfo = cVar.f87819e;
        boolean z11 = cVar.f87820f;
        String str = cVar.f87821g;
        BlockDTO blockDTO = cVar.f87822h;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(localId, "localId");
        Intrinsics.checkNotNullParameter(messageTypeData, "messageTypeData");
        Intrinsics.checkNotNullParameter(composedMessageInfo, "composedMessageInfo");
        return new c(chatId, localId, j11, messageTypeData, composedMessageInfo, z11, str, blockDTO);
    }

    @NotNull
    public final String b() {
        return this.f87815a;
    }

    @NotNull
    public final ComposedMessageInfo c() {
        return this.f87819e;
    }

    @NotNull
    public final String d() {
        return this.f87816b;
    }

    public final BlockDTO e() {
        return this.f87822h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f87815a, cVar.f87815a) && Intrinsics.d(this.f87816b, cVar.f87816b) && this.f87817c == cVar.f87817c && Intrinsics.d(this.f87818d, cVar.f87818d) && Intrinsics.d(this.f87819e, cVar.f87819e) && this.f87820f == cVar.f87820f && Intrinsics.d(this.f87821g, cVar.f87821g) && Intrinsics.d(this.f87822h, cVar.f87822h);
    }

    @NotNull
    public final y0 f() {
        return this.f87818d;
    }

    public final String g() {
        return this.f87821g;
    }

    public final long h() {
        return this.f87817c;
    }

    public final int hashCode() {
        int a11 = C3532b.a((this.f87819e.hashCode() + ((this.f87818d.hashCode() + Pk0.c.a(g.a(this.f87815a.hashCode() * 31, 31, this.f87816b), 31, this.f87817c)) * 31)) * 31, 31, this.f87820f);
        String str = this.f87821g;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        BlockDTO blockDTO = this.f87822h;
        return hashCode + (blockDTO != null ? blockDTO.hashCode() : 0);
    }

    public final boolean i() {
        return this.f87820f;
    }

    @NotNull
    public final String toString() {
        return "SendMessageModel(chatId=" + this.f87815a + ", localId=" + this.f87816b + ", version=" + this.f87817c + ", messageTypeData=" + this.f87818d + ", composedMessageInfo=" + this.f87819e + ", isUndelivered=" + this.f87820f + ", replyToMessageId=" + this.f87821g + ", localMessageBlock=" + this.f87822h + ")";
    }

    public /* synthetic */ c(String str, String str2, y0 y0Var, ComposedMessageInfo composedMessageInfo, String str3, BlockDTO blockDTO, int i11) {
        this(str, str2, 1L, y0Var, composedMessageInfo, false, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : blockDTO);
    }
}
