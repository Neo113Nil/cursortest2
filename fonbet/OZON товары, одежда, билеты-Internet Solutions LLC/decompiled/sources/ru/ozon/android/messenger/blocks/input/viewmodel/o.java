package ru.ozon.android.messenger.blocks.input.viewmodel;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.blocks.input.e;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f85664a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f85665b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85666c;

    /* renamed from: d, reason: collision with root package name */
    private final CustomBlockDTO f85667d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f85668e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<ru.ozon.android.messenger.blocks.input.pickerlauncher.e> f85669f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f85670g;

    /* renamed from: h, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.input.a f85671h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f85672i;

    /* renamed from: j, reason: collision with root package name */
    private final IconButtonV3DTO f85673j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.e f85674k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f85675l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f85676a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f85677b;

        public a() {
            this(0);
        }

        public final boolean a() {
            return this.f85677b;
        }

        @NotNull
        public final String b() {
            return this.f85676a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f85676a, aVar.f85676a) && this.f85677b == aVar.f85677b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85677b) + (this.f85676a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextMessage(text=");
            sb2.append(this.f85676a);
            sb2.append(", forceUpdateInView=");
            return Pk0.a.a(")", sb2, this.f85677b);
        }

        public /* synthetic */ a(int i11) {
            this("", false);
        }

        public a(@NotNull String text, boolean z11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f85676a = text;
            this.f85677b = z11;
        }
    }

    public o() {
        this(false, null, null, null, null, null, null, null, false, 4095);
    }

    public static o a(o oVar, boolean z11, a aVar, List list, Set set, boolean z12, IconButtonV3DTO iconButtonV3DTO, ru.ozon.android.messenger.blocks.input.e eVar, int i11) {
        boolean z13 = (i11 & 1) != 0 ? oVar.f85664a : z11;
        a textMessage = (i11 & 2) != 0 ? oVar.f85665b : aVar;
        String str = oVar.f85666c;
        CustomBlockDTO customBlockDTO = (i11 & 8) != 0 ? oVar.f85667d : null;
        List attachments = (i11 & 16) != 0 ? oVar.f85668e : list;
        Set set2 = (i11 & 32) != 0 ? oVar.f85669f : set;
        boolean z14 = (i11 & 64) != 0 ? oVar.f85670g : z12;
        ru.ozon.android.messenger.blocks.input.a aVar2 = oVar.f85671h;
        boolean z15 = (i11 & 256) != 0 ? oVar.f85672i : true;
        IconButtonV3DTO iconButtonV3DTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oVar.f85673j : iconButtonV3DTO;
        ru.ozon.android.messenger.blocks.input.e currentModeName = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oVar.f85674k : eVar;
        boolean z16 = (i11 & 2048) != 0 ? oVar.f85675l : false;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(currentModeName, "currentModeName");
        return new o(z13, textMessage, str, customBlockDTO, attachments, set2, z14, aVar2, z15, iconButtonV3DTO2, currentModeName, z16);
    }

    @NotNull
    public final List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> b() {
        return this.f85668e;
    }

    public final ru.ozon.android.messenger.blocks.input.a c() {
        return this.f85671h;
    }

    @NotNull
    public final ru.ozon.android.messenger.blocks.input.e d() {
        return this.f85674k;
    }

    public final IconButtonV3DTO e() {
        return this.f85673j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f85664a == oVar.f85664a && Intrinsics.d(this.f85665b, oVar.f85665b) && Intrinsics.d(this.f85666c, oVar.f85666c) && Intrinsics.d(this.f85667d, oVar.f85667d) && Intrinsics.d(this.f85668e, oVar.f85668e) && Intrinsics.d(this.f85669f, oVar.f85669f) && this.f85670g == oVar.f85670g && Intrinsics.d(this.f85671h, oVar.f85671h) && this.f85672i == oVar.f85672i && Intrinsics.d(this.f85673j, oVar.f85673j) && Intrinsics.d(this.f85674k, oVar.f85674k) && this.f85675l == oVar.f85675l;
    }

    public final CustomBlockDTO f() {
        return this.f85667d;
    }

    public final boolean g() {
        return this.f85672i;
    }

    public final Set<ru.ozon.android.messenger.blocks.input.pickerlauncher.e> h() {
        return this.f85669f;
    }

    public final int hashCode() {
        int hashCode = (this.f85665b.hashCode() + (Boolean.hashCode(this.f85664a) * 31)) * 31;
        String str = this.f85666c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CustomBlockDTO customBlockDTO = this.f85667d;
        int b11 = G.g.b((hashCode2 + (customBlockDTO == null ? 0 : customBlockDTO.hashCode())) * 31, 31, this.f85668e);
        Set<ru.ozon.android.messenger.blocks.input.pickerlauncher.e> set = this.f85669f;
        int a11 = C3532b.a((b11 + (set == null ? 0 : set.hashCode())) * 31, 31, this.f85670g);
        ru.ozon.android.messenger.blocks.input.a aVar = this.f85671h;
        int a12 = C3532b.a((a11 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f85672i);
        IconButtonV3DTO iconButtonV3DTO = this.f85673j;
        return Boolean.hashCode(this.f85675l) + ((this.f85674k.hashCode() + ((a12 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean i() {
        return this.f85675l;
    }

    public final boolean j() {
        return this.f85670g;
    }

    public final String k() {
        return this.f85666c;
    }

    @NotNull
    public final a l() {
        return this.f85665b;
    }

    public final boolean m() {
        return this.f85664a;
    }

    public final boolean n() {
        if (this.f85664a) {
            if (!Intrinsics.d(this.f85674k, e.b.f85534a)) {
                int size = this.f85668e.size();
                ru.ozon.android.messenger.blocks.input.a aVar = this.f85671h;
                if (size < (aVar != null ? aVar.c() : 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z11;
        Map<String, String> payload;
        if (this.f85664a) {
            boolean z12 = kotlin.text.h.z0(this.f85665b.b()).toString().length() > 0;
            List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list = this.f85668e;
            if (!list.isEmpty()) {
                List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next()).f() instanceof b.c.C1502b) {
                            z11 = false;
                            break;
                        }
                    }
                }
            }
            z11 = true;
            if (!Intrinsics.d(this.f85674k, e.c.f85535a)) {
                CustomBlockDTO customBlockDTO = this.f85667d;
                if (Boolean.parseBoolean((customBlockDTO == null || (payload = customBlockDTO.getPayload()) == null) ? null : payload.get("canSendAlone")) || z12 || (!list.isEmpty() && z11)) {
                }
            } else if (z12 && z11) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return "InputViewState(isInputEnabled=" + this.f85664a + ", textMessage=" + this.f85665b + ", textHint=" + this.f85666c + ", customBlock=" + this.f85667d + ", attachments=" + this.f85668e + ", incidents=" + this.f85669f + ", showAttachmentsRestriction=" + this.f85670g + ", config=" + this.f85671h + ", ignoreDrafts=" + this.f85672i + ", currentSendButton=" + this.f85673j + ", currentModeName=" + this.f85674k + ", requestInputFocus=" + this.f85675l + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(boolean z11, @NotNull a textMessage, String str, CustomBlockDTO customBlockDTO, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> attachments, Set<? extends ru.ozon.android.messenger.blocks.input.pickerlauncher.e> set, boolean z12, ru.ozon.android.messenger.blocks.input.a aVar, boolean z13, IconButtonV3DTO iconButtonV3DTO, @NotNull ru.ozon.android.messenger.blocks.input.e currentModeName, boolean z14) {
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(currentModeName, "currentModeName");
        this.f85664a = z11;
        this.f85665b = textMessage;
        this.f85666c = str;
        this.f85667d = customBlockDTO;
        this.f85668e = attachments;
        this.f85669f = set;
        this.f85670g = z12;
        this.f85671h = aVar;
        this.f85672i = z13;
        this.f85673j = iconButtonV3DTO;
        this.f85674k = currentModeName;
        this.f85675l = z14;
    }

    public o(boolean z11, a aVar, String str, CustomBlockDTO customBlockDTO, List list, ru.ozon.android.messenger.blocks.input.a aVar2, IconButtonV3DTO iconButtonV3DTO, ru.ozon.android.messenger.blocks.input.e eVar, boolean z12, int i11) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? new a(0) : aVar, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : customBlockDTO, (i11 & 16) != 0 ? K.f71697a : list, M.f71699a, false, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : aVar2, false, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : iconButtonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? e.a.f85533a : eVar, (i11 & 2048) != 0 ? false : z12);
    }
}
