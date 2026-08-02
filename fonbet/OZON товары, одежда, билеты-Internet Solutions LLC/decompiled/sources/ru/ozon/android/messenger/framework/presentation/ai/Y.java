package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;

/* loaded from: classes10.dex */
public interface Y {

    public static final class a implements Y {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f89404a = new a();
    }

    public static final class b implements Y {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AiMessageActionsDTO.SourcesBadge.MenuInfo f89405a;

        public b(@NotNull AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo) {
            Intrinsics.checkNotNullParameter(menuInfo, "menuInfo");
            this.f89405a = menuInfo;
        }

        @NotNull
        public final AiMessageActionsDTO.SourcesBadge.MenuInfo a() {
            return this.f89405a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f89405a, ((b) obj).f89405a);
        }

        public final int hashCode() {
            return this.f89405a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OpenSourcesCurtain(menuInfo=" + this.f89405a + ")";
        }
    }

    public static final class c implements Y {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f89406a = new c();
    }
}
