package ru.ozon.android.messenger.blocks.buttons;

import B90.C2618u;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84419a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f84420b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f84421c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f84422a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f84423b;

        public a(@NotNull b layoutType, @NotNull ArrayList buttonsVO) {
            Intrinsics.checkNotNullParameter(layoutType, "layoutType");
            Intrinsics.checkNotNullParameter(buttonsVO, "buttonsVO");
            this.f84422a = layoutType;
            this.f84423b = buttonsVO;
        }

        @NotNull
        public final List<ru.ozon.android.messenger.blocks.buttons.a> a() {
            return this.f84423b;
        }

        @NotNull
        public final b b() {
            return this.f84422a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84422a == aVar.f84422a && this.f84423b.equals(aVar.f84423b);
        }

        public final int hashCode() {
            return this.f84423b.hashCode() + (this.f84422a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChatButtonsVO(layoutType=");
            sb2.append(this.f84422a);
            sb2.append(", buttonsVO=");
            return Om.a(")", sb2, this.f84423b);
        }
    }

    public f(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull ArrayList chatButtonsVO, boolean z11) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(chatButtonsVO, "chatButtonsVO");
        this.f84419a = blockId;
        this.f84420b = chatButtonsVO;
        this.f84421c = z11;
    }

    public static f a(f fVar, boolean z11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = fVar.f84419a;
        ArrayList chatButtonsVO = fVar.f84420b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(chatButtonsVO, "chatButtonsVO");
        return new f(blockId, chatButtonsVO, z11);
    }

    @NotNull
    public final List<a> b() {
        return this.f84420b;
    }

    public final boolean c() {
        return this.f84421c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f84419a, fVar.f84419a) && this.f84420b.equals(fVar.f84420b) && this.f84421c == fVar.f84421c;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84419a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84421c) + C2618u.b(this.f84420b, this.f84419a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatButtonsWrapperVO(blockId=");
        sb2.append(this.f84419a);
        sb2.append(", chatButtonsVO=");
        sb2.append(this.f84420b);
        sb2.append(", isButtonsEnabled=");
        return Pk0.a.a(")", sb2, this.f84421c);
    }
}
