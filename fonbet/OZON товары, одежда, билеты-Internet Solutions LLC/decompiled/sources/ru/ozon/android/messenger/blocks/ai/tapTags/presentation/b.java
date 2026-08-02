package ru.ozon.android.messenger.blocks.ai.tapTags.presentation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final long f84325a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ButtonV3DTO f84326b;

        public a(long j11, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.f84325a = j11;
            this.f84326b = button;
        }

        public static a a(a aVar, ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new a(aVar.f84325a, button);
        }

        @NotNull
        public final ButtonV3DTO b() {
            return this.f84326b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84325a == aVar.f84325a && Intrinsics.d(this.f84326b, aVar.f84326b);
        }

        @Override // ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b
        public final long getId() {
            return this.f84325a;
        }

        public final int hashCode() {
            return this.f84326b.hashCode() + (Long.hashCode(this.f84325a) * 31);
        }

        @NotNull
        public final String toString() {
            return "ButtonItem(id=" + this.f84325a + ", button=" + this.f84326b + ")";
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b$b, reason: collision with other inner class name */
    public static final class C1465b implements b {

        /* renamed from: a, reason: collision with root package name */
        private final long f84327a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final TagButtonDTO f84328b;

        static {
            TagButtonDTO.Companion companion = TagButtonDTO.INSTANCE;
        }

        public C1465b(long j11, @NotNull TagButtonDTO tagButton) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            this.f84327a = j11;
            this.f84328b = tagButton;
        }

        public static C1465b a(C1465b c1465b, TagButtonDTO tagButton) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            return new C1465b(c1465b.f84327a, tagButton);
        }

        @NotNull
        public final TagButtonDTO b() {
            return this.f84328b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1465b)) {
                return false;
            }
            C1465b c1465b = (C1465b) obj;
            return this.f84327a == c1465b.f84327a && Intrinsics.d(this.f84328b, c1465b.f84328b);
        }

        @Override // ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b
        public final long getId() {
            return this.f84327a;
        }

        public final int hashCode() {
            return this.f84328b.hashCode() + (Long.hashCode(this.f84327a) * 31);
        }

        @NotNull
        public final String toString() {
            return "TagButtonItem(id=" + this.f84327a + ", tagButton=" + this.f84328b + ")";
        }
    }

    long getId();
}
