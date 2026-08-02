package ru.ozon.android.messenger.framework.presentation.common.popupmenu.action;

import El.C2971a;
import Kk.C3532b;
import T7.P;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextDTO f90808a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final IconDTO f90809b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final AtomActionDTO f90810c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f90811d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f90812e;

        public a(@NotNull TextDTO titleTextDTO, @NotNull IconDTO iconDTO, @NotNull AtomActionDTO action, boolean z11, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(titleTextDTO, "titleTextDTO");
            Intrinsics.checkNotNullParameter(iconDTO, "iconDTO");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f90808a = titleTextDTO;
            this.f90809b = iconDTO;
            this.f90810c = action;
            this.f90811d = z11;
            this.f90812e = map;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c
        public final void a(@NotNull ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.a popupMenuActionView, @NotNull Function2 actionHandler) {
            Intrinsics.checkNotNullParameter(popupMenuActionView, "popupMenuActionView");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            popupMenuActionView.bindTitle(this.f90808a);
            popupMenuActionView.e(this.f90809b);
            popupMenuActionView.f(this.f90811d);
            b onClickListener = new b(actionHandler, this);
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            popupMenuActionView.setOnClickListener(new Lx.a(onClickListener, 1));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f90808a, aVar.f90808a) && Intrinsics.d(this.f90809b, aVar.f90809b) && Intrinsics.d(this.f90810c, aVar.f90810c) && this.f90811d == aVar.f90811d && Intrinsics.d(this.f90812e, aVar.f90812e);
        }

        public final int hashCode() {
            int a11 = C3532b.a(Ih.a.b(this.f90810c, C2971a.a(this.f90809b, this.f90808a.hashCode() * 31, 31), 31), 31, this.f90811d);
            Map<String, MessengerTrackingInfo> map = this.f90812e;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(titleTextDTO=");
            sb2.append(this.f90808a);
            sb2.append(", iconDTO=");
            sb2.append(this.f90809b);
            sb2.append(", action=");
            sb2.append(this.f90810c);
            sb2.append(", showSeparator=");
            sb2.append(this.f90811d);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f90812e, ")");
        }
    }

    void a(@NotNull ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.a aVar, @NotNull Function2 function2);
}
