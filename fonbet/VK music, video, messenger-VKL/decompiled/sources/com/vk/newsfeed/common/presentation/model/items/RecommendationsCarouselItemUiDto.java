package com.vk.newsfeed.common.presentation.model.items;

import com.vk.dto.common.Image;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.oq;
import xsna.u11;
import xsna.urd0;
import xsna.xq;
import xsna.zrp;

/* compiled from: RecommendationsCarouselItemUiDto.kt */
/* loaded from: classes4.dex */
public final class RecommendationsCarouselItemUiDto {
    public final c a;
    public final CharSequence b;
    public final b c;
    public final a d;
    public final ActionButtonData e;

    /* compiled from: RecommendationsCarouselItemUiDto.kt */
    public static final class ActionButtonData {
        public final CharSequence a;
        public final String b;
        public final Integer c;
        public final ActionState d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RecommendationsCarouselItemUiDto.kt */
        public static final class ActionState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ActionState[] $VALUES;
            public static final ActionState COMPLETED;
            public static final ActionState IN_PROGRESS;
            public static final ActionState NONE;

            static {
                ActionState actionState = new ActionState("NONE", 0);
                NONE = actionState;
                ActionState actionState2 = new ActionState("IN_PROGRESS", 1);
                IN_PROGRESS = actionState2;
                ActionState actionState3 = new ActionState("COMPLETED", 2);
                COMPLETED = actionState3;
                ActionState[] actionStateArr = {actionState, actionState2, actionState3};
                $VALUES = actionStateArr;
                $ENTRIES = new asp(actionStateArr);
            }

            public ActionState() {
                throw null;
            }

            public static ActionState valueOf(String str) {
                return (ActionState) Enum.valueOf(ActionState.class, str);
            }

            public static ActionState[] values() {
                return (ActionState[]) $VALUES.clone();
            }
        }

        public ActionButtonData(String str, String str2, Integer num, ActionState actionState, int i) {
            str2 = (i & 2) != 0 ? str.toString() : str2;
            num = (i & 4) != 0 ? null : num;
            actionState = (i & 8) != 0 ? ActionState.NONE : actionState;
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = actionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButtonData)) {
                return false;
            }
            ActionButtonData actionButtonData = (ActionButtonData) obj;
            return epx.f(this.a, actionButtonData.a) && epx.f(this.b, actionButtonData.b) && epx.f(this.c, actionButtonData.c) && this.d == actionButtonData.d;
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            Integer num = this.c;
            return this.d.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "ActionButtonData(title=" + ((Object) this.a) + ", contentDescription=" + this.b + ", iconRes=" + this.c + ", actionState=" + this.d + ')';
        }
    }

    /* compiled from: RecommendationsCarouselItemUiDto.kt */
    public static final class a {
        public final CharSequence a;
        public final InterfaceC1369a b;
        public final boolean c;

        /* compiled from: RecommendationsCarouselItemUiDto.kt */
        /* renamed from: com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto$a$a, reason: collision with other inner class name */
        public interface InterfaceC1369a {

            /* compiled from: RecommendationsCarouselItemUiDto.kt */
            /* renamed from: com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto$a$a$a, reason: collision with other inner class name */
            public static final class C1370a implements InterfaceC1369a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1370a)) {
                        return false;
                    }
                    ((C1370a) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Drawables(resIds=null)";
                }
            }

            /* compiled from: RecommendationsCarouselItemUiDto.kt */
            /* renamed from: com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto$a$a$b */
            public static final class b implements InterfaceC1369a {
                public final List<Image> a;

                public b(List<Image> list) {
                    this.a = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("Urls(images="), this.a);
                }
            }
        }

        public a(CharSequence charSequence, InterfaceC1369a.b bVar, boolean z) {
            this.a = charSequence;
            this.b = bVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            InterfaceC1369a interfaceC1369a = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (interfaceC1369a == null ? 0 : interfaceC1369a.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BadgeData(title=");
            sb.append((Object) this.a);
            sb.append(", images=");
            sb.append(this.b);
            sb.append(", drawImagesBorder=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: RecommendationsCarouselItemUiDto.kt */
    public static final class b {
        public final Image a;
        public final a b;

        /* compiled from: RecommendationsCarouselItemUiDto.kt */
        public static final class a {
            public final float a;
            public final float b;
            public final float c;
            public final float d;

            public a(float f, float f2, float f3, float f4) {
                this.a = f;
                this.b = f2;
                this.c = f3;
                this.d = f4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CropRect(x1=");
                sb.append(this.a);
                sb.append(", x2=");
                sb.append(this.b);
                sb.append(", y1=");
                sb.append(this.c);
                sb.append(", y2=");
                return xq.c(')', this.d, sb);
            }
        }

        public b(Image image, a aVar) {
            this.a = image;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            a aVar = this.b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "ImageData(image=" + this.a + ", cropRect=" + this.b + ')';
        }
    }

    /* compiled from: RecommendationsCarouselItemUiDto.kt */
    public static final class c {
        public final CharSequence a;
        public final Integer b;
        public final Integer c;

        public c(CharSequence charSequence, Integer num, Integer num2, int i) {
            num = (i & 4) != 0 ? null : num;
            num2 = (i & 8) != 0 ? null : num2;
            this.a = charSequence;
            this.b = num;
            this.c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 961;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            return (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TitleData(text=");
            sb.append((Object) this.a);
            sb.append(", secondaryTitleText=null, icon=");
            sb.append(this.b);
            sb.append(", iconTint=");
            return oq.b(sb, this.c, ", iconContentDescription=null)");
        }
    }

    public RecommendationsCarouselItemUiDto(c cVar, String str, b bVar, a aVar, ActionButtonData actionButtonData) {
        this.a = cVar;
        this.b = str;
        this.c = bVar;
        this.d = aVar;
        this.e = actionButtonData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationsCarouselItemUiDto)) {
            return false;
        }
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = (RecommendationsCarouselItemUiDto) obj;
        return epx.f(this.a, recommendationsCarouselItemUiDto.a) && epx.f(this.b, recommendationsCarouselItemUiDto.b) && epx.f(this.c, recommendationsCarouselItemUiDto.c) && epx.f(this.d, recommendationsCarouselItemUiDto.d) && epx.f(this.e, recommendationsCarouselItemUiDto.e);
    }

    public final int hashCode() {
        int c2 = u11.c(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        int hashCode = (c2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.d;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ActionButtonData actionButtonData = this.e;
        return hashCode2 + (actionButtonData != null ? actionButtonData.hashCode() : 0);
    }

    public final String toString() {
        return "RecommendationsCarouselItemUiDto(title=" + this.a + ", subtitle=" + ((Object) this.b) + ", image=" + this.c + ", badge=" + this.d + ", actionButton=" + this.e + ')';
    }
}
