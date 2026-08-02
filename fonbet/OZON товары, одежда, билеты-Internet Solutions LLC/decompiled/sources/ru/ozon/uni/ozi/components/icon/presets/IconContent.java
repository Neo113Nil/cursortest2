package ru.ozon.uni.ozi.components.icon.presets;

import K1.T;
import N3.C3660k;
import Pk0.c;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/IconContent;", "", "<init>", "()V", "Graphic", "Label", "Lru/ozon/uni/ozi/components/icon/presets/IconContent$Graphic;", "Lru/ozon/uni/ozi/components/icon/presets/IconContent$Label;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class IconContent {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/IconContent$Graphic;", "Lru/ozon/uni/ozi/components/icon/presets/IconContent;", "Lq1/b;", "icon", "Ll1/Z;", "color", "<init>", "(Lq1/b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lq1/b;", "getIcon$uni_release", "()Lq1/b;", "J", "getColor-0d7_KjU$uni_release", "()J", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Graphic extends IconContent {
        private final long color;
        private final AbstractC8972b icon;

        public /* synthetic */ Graphic(AbstractC8972b abstractC8972b, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC8972b, j11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Graphic)) {
                return false;
            }
            Graphic graphic = (Graphic) other;
            return Intrinsics.d(this.icon, graphic.icon) && C7807Z.p(this.color, graphic.color);
        }

        /* renamed from: getColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: getIcon$uni_release, reason: from getter */
        public final AbstractC8972b getIcon() {
            return this.icon;
        }

        public int hashCode() {
            AbstractC8972b abstractC8972b = this.icon;
            int hashCode = abstractC8972b == null ? 0 : abstractC8972b.hashCode();
            long j11 = this.color;
            int i11 = C7807Z.f72260n;
            C.Companion companion = C.INSTANCE;
            return Long.hashCode(j11) + (hashCode * 31);
        }

        @NotNull
        public String toString() {
            return "Graphic(icon=" + this.icon + ", color=" + C7807Z.v(this.color) + ")";
        }

        private Graphic(AbstractC8972b abstractC8972b, long j11) {
            super(null);
            this.icon = abstractC8972b;
            this.color = j11;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/IconContent$Label;", "Lru/ozon/uni/ozi/components/icon/presets/IconContent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "text", "Ljava/lang/String;", "getText$uni_release", "Ll1/Z;", "color", "J", "getColor-0d7_KjU$uni_release", "()J", "LK1/T;", "style", "LK1/T;", "getStyle$uni_release", "()LK1/T;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Label extends IconContent {
        private final long color;

        @NotNull
        private final T style;

        @NotNull
        private final String text;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.d(this.text, label.text) && C7807Z.p(this.color, label.color) && Intrinsics.d(this.style, label.style);
        }

        /* renamed from: getColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: getStyle$uni_release, reason: from getter */
        public final T getStyle() {
            return this.style;
        }

        @NotNull
        /* renamed from: getText$uni_release, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            long j11 = this.color;
            int i11 = C7807Z.f72260n;
            C.Companion companion = C.INSTANCE;
            return this.style.hashCode() + c.a(hashCode, 31, j11);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String v11 = C7807Z.v(this.color);
            T t2 = this.style;
            StringBuilder d11 = C3660k.d("Label(text=", str, ", color=", v11, ", style=");
            d11.append(t2);
            d11.append(")");
            return d11.toString();
        }
    }

    public /* synthetic */ IconContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IconContent() {
    }
}
