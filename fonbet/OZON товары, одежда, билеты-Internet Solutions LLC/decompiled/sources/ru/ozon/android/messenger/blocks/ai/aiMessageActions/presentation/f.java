package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import Fm.C3051a;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class f implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84014a;

    /* renamed from: b, reason: collision with root package name */
    private final AiMessageActionsDTO.SourcesBadge f84015b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f84016c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f84017a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final IconButtonV3DTO f84018b;

        /* renamed from: c, reason: collision with root package name */
        private final IconButtonV3DTO f84019c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f84020d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f84021e;

        static {
            int i11 = IconButtonV3DTO.$stable;
        }

        public a(int i11, @NotNull IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, Boolean bool, Long l11) {
            Intrinsics.checkNotNullParameter(iconButtonV3DTO, "default");
            this.f84017a = i11;
            this.f84018b = iconButtonV3DTO;
            this.f84019c = iconButtonV3DTO2;
            this.f84020d = bool;
            this.f84021e = l11;
        }

        public static a a(a aVar, Boolean bool) {
            IconButtonV3DTO iconButtonV3DTO = aVar.f84018b;
            Intrinsics.checkNotNullParameter(iconButtonV3DTO, "default");
            return new a(aVar.f84017a, iconButtonV3DTO, aVar.f84019c, bool, aVar.f84021e);
        }

        public final IconButtonV3DTO b() {
            return this.f84019c;
        }

        @NotNull
        public final IconButtonV3DTO c() {
            return this.f84018b;
        }

        public final int d() {
            return this.f84017a;
        }

        public final Long e() {
            return this.f84021e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84017a == aVar.f84017a && Intrinsics.d(this.f84018b, aVar.f84018b) && Intrinsics.d(this.f84019c, aVar.f84019c) && Intrinsics.d(this.f84020d, aVar.f84020d) && Intrinsics.d(this.f84021e, aVar.f84021e);
        }

        public final Boolean f() {
            return this.f84020d;
        }

        public final boolean g() {
            return this.f84019c != null && this.f84021e == null;
        }

        public final int hashCode() {
            int c11 = GR.b.c(this.f84018b, Integer.hashCode(this.f84017a) * 31, 31);
            IconButtonV3DTO iconButtonV3DTO = this.f84019c;
            int hashCode = (c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            Boolean bool = this.f84020d;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l11 = this.f84021e;
            return hashCode2 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IconButton(id=");
            sb2.append(this.f84017a);
            sb2.append(", default=");
            sb2.append(this.f84018b);
            sb2.append(", clicked=");
            sb2.append(this.f84019c);
            sb2.append(", isSelected=");
            sb2.append(this.f84020d);
            sb2.append(", ttl=");
            return C3051a.d(sb2, this.f84021e, ")");
        }
    }

    public f(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, AiMessageActionsDTO.SourcesBadge sourcesBadge, @NotNull ArrayList iconButtons) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        this.f84014a = blockId;
        this.f84015b = sourcesBadge;
        this.f84016c = iconButtons;
    }

    public static f a(f fVar, ArrayList iconButtons) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = fVar.f84014a;
        AiMessageActionsDTO.SourcesBadge sourcesBadge = fVar.f84015b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        return new f(blockId, sourcesBadge, iconButtons);
    }

    @NotNull
    public final List<a> b() {
        return this.f84016c;
    }

    public final AiMessageActionsDTO.SourcesBadge c() {
        return this.f84015b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f84014a, fVar.f84014a) && Intrinsics.d(this.f84015b, fVar.f84015b) && this.f84016c.equals(fVar.f84016c);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84014a;
    }

    public final int hashCode() {
        int hashCode = this.f84014a.hashCode() * 31;
        AiMessageActionsDTO.SourcesBadge sourcesBadge = this.f84015b;
        return this.f84016c.hashCode() + ((hashCode + (sourcesBadge == null ? 0 : sourcesBadge.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiMessageActionsVO(blockId=");
        sb2.append(this.f84014a);
        sb2.append(", sourcesBadge=");
        sb2.append(this.f84015b);
        sb2.append(", iconButtons=");
        return Om.a(")", sb2, this.f84016c);
    }
}
