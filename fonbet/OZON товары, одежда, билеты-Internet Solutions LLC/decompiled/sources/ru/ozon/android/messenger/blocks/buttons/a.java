package ru.ozon.android.messenger.blocks.buttons;

import B90.C2618u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f84397a;

    /* renamed from: ru.ozon.android.messenger.blocks.buttons.a$a, reason: collision with other inner class name */
    public static final class C1471a extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f84398b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.navigation.action.a f84399c;

        /* renamed from: d, reason: collision with root package name */
        private final List<String> f84400d;

        /* renamed from: e, reason: collision with root package name */
        private final String f84401e;

        /* renamed from: f, reason: collision with root package name */
        private final ButtonV3Atom.SmallBorderlessButton f84402f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1471a(@NotNull ArrayList textVO, @NotNull ru.ozon.android.messenger.framework.navigation.action.a actionWrapper, List list, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
            super(e.ORDER.ordinal());
            Intrinsics.checkNotNullParameter(textVO, "textVO");
            Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
            this.f84398b = textVO;
            this.f84399c = actionWrapper;
            this.f84400d = list;
            this.f84401e = str;
            this.f84402f = smallBorderlessButton;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.navigation.action.a b() {
            return this.f84399c;
        }

        public final List<String> c() {
            return this.f84400d;
        }

        public final ButtonV3Atom.SmallBorderlessButton d() {
            return this.f84402f;
        }

        public final String e() {
            return this.f84401e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1471a)) {
                return false;
            }
            C1471a c1471a = (C1471a) obj;
            return Intrinsics.d(this.f84398b, c1471a.f84398b) && Intrinsics.d(this.f84399c, c1471a.f84399c) && Intrinsics.d(this.f84400d, c1471a.f84400d) && Intrinsics.d(this.f84401e, c1471a.f84401e) && Intrinsics.d(this.f84402f, c1471a.f84402f);
        }

        @NotNull
        public final List<g> f() {
            return this.f84398b;
        }

        public final int hashCode() {
            int hashCode = (this.f84399c.hashCode() + (this.f84398b.hashCode() * 31)) * 31;
            List<String> list = this.f84400d;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f84401e;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.f84402f;
            return hashCode3 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "OrderFixButtonVO(textVO=" + this.f84398b + ", actionWrapper=" + this.f84399c + ", imageUrls=" + this.f84400d + ", plusCount=" + this.f84401e + ", orderButton=" + this.f84402f + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.navigation.action.a f84403b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f84404c;

        /* renamed from: d, reason: collision with root package name */
        private final Icon f84405d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ru.ozon.android.messenger.framework.navigation.action.a actionWrapper, @NotNull ArrayList textVO, Icon icon) {
            super(e.TEXT.ordinal());
            Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
            Intrinsics.checkNotNullParameter(textVO, "textVO");
            this.f84403b = actionWrapper;
            this.f84404c = textVO;
            this.f84405d = icon;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.navigation.action.a b() {
            return this.f84403b;
        }

        public final Icon c() {
            return this.f84405d;
        }

        @NotNull
        public final List<g> d() {
            return this.f84404c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f84403b, bVar.f84403b) && Intrinsics.d(this.f84404c, bVar.f84404c) && Intrinsics.d(this.f84405d, bVar.f84405d);
        }

        public final int hashCode() {
            int b11 = C2618u.b(this.f84404c, this.f84403b.hashCode() * 31, 31);
            Icon icon = this.f84405d;
            return b11 + (icon == null ? 0 : icon.hashCode());
        }

        @NotNull
        public final String toString() {
            return "TextButtonVO(actionWrapper=" + this.f84403b + ", textVO=" + this.f84404c + ", icon=" + this.f84405d + ")";
        }
    }

    public a(int i11) {
        this.f84397a = i11;
    }

    public final int a() {
        return this.f84397a;
    }
}
