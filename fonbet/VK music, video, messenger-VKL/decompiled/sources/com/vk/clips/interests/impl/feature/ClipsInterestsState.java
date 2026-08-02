package com.vk.clips.interests.impl.feature;

import com.vk.dto.common.Image;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.epx;
import xsna.er;
import xsna.fld;
import xsna.fw3;
import xsna.jge;
import xsna.km50;
import xsna.zrp;

/* compiled from: ClipsInterestsState.kt */
/* loaded from: classes16.dex */
public interface ClipsInterestsState extends km50 {

    /* compiled from: ClipsInterestsState.kt */
    public static final class Content implements ClipsInterestsState {
        public final Image b;
        public final Step c;
        public final List<jge.a> d;
        public final List<jge.b> e;
        public final Set<fld> f;
        public final FlowCompletedType g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsInterestsState.kt */
        public static final class FlowCompletedType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FlowCompletedType[] $VALUES;
            public static final FlowCompletedType FLOW_FINISHED_CONTENT_HIDDEN;
            public static final FlowCompletedType FLOW_FINISHED_CONTENT_VISIBLE;
            public static final FlowCompletedType FLOW_IN_PROGRESS;

            static {
                FlowCompletedType flowCompletedType = new FlowCompletedType("FLOW_FINISHED_CONTENT_VISIBLE", 0);
                FLOW_FINISHED_CONTENT_VISIBLE = flowCompletedType;
                FlowCompletedType flowCompletedType2 = new FlowCompletedType("FLOW_FINISHED_CONTENT_HIDDEN", 1);
                FLOW_FINISHED_CONTENT_HIDDEN = flowCompletedType2;
                FlowCompletedType flowCompletedType3 = new FlowCompletedType("FLOW_IN_PROGRESS", 2);
                FLOW_IN_PROGRESS = flowCompletedType3;
                FlowCompletedType[] flowCompletedTypeArr = {flowCompletedType, flowCompletedType2, flowCompletedType3};
                $VALUES = flowCompletedTypeArr;
                $ENTRIES = new asp(flowCompletedTypeArr);
            }

            public FlowCompletedType() {
                throw null;
            }

            public static FlowCompletedType valueOf(String str) {
                return (FlowCompletedType) Enum.valueOf(FlowCompletedType.class, str);
            }

            public static FlowCompletedType[] values() {
                return (FlowCompletedType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsInterestsState.kt */
        public static final class Step {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Step[] $VALUES;
            public static final Step MAIN_CATEGORIES_CHOICE;
            public static final Step SUB_CATEGORIES_CHOICE;

            static {
                Step step = new Step("MAIN_CATEGORIES_CHOICE", 0);
                MAIN_CATEGORIES_CHOICE = step;
                Step step2 = new Step("SUB_CATEGORIES_CHOICE", 1);
                SUB_CATEGORIES_CHOICE = step2;
                Step[] stepArr = {step, step2};
                $VALUES = stepArr;
                $ENTRIES = new asp(stepArr);
            }

            public Step() {
                throw null;
            }

            public static Step valueOf(String str) {
                return (Step) Enum.valueOf(Step.class, str);
            }

            public static Step[] values() {
                return (Step[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(Image image, Step step, List<jge.a> list, List<jge.b> list2, Set<? extends fld> set, FlowCompletedType flowCompletedType) {
            this.b = image;
            this.c = step;
            this.d = list;
            this.e = list2;
            this.f = set;
            this.g = flowCompletedType;
        }

        public static Content a(Content content, Image image, Step step, List list, List list2, Set set, FlowCompletedType flowCompletedType, int i) {
            if ((i & 1) != 0) {
                image = content.b;
            }
            Image image2 = image;
            if ((i & 2) != 0) {
                step = content.c;
            }
            Step step2 = step;
            if ((i & 4) != 0) {
                list = content.d;
            }
            List list3 = list;
            if ((i & 8) != 0) {
                list2 = content.e;
            }
            List list4 = list2;
            if ((i & 16) != 0) {
                set = content.f;
            }
            Set set2 = set;
            if ((i & 32) != 0) {
                flowCompletedType = content.g;
            }
            content.getClass();
            return new Content(image2, step2, list3, list4, set2, flowCompletedType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return epx.f(this.b, content.b) && this.c == content.c && epx.f(this.d, content.d) && epx.f(this.e, content.e) && epx.f(this.f, content.f) && this.g == content.g;
        }

        public final int hashCode() {
            Image image = this.b;
            return this.g.hashCode() + fw3.b(fw3.a(fw3.a((this.c.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            return "Content(avatar=" + this.b + ", step=" + this.c + ", categories=" + this.d + ", suggestedSubcategories=" + this.e + ", selectedIds=" + this.f + ", flowState=" + this.g + ')';
        }
    }

    /* compiled from: ClipsInterestsState.kt */
    public static final class a implements ClipsInterestsState {
        public final Image b;

        public a(Image image) {
            this.b = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            Image image = this.b;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        public final String toString() {
            return er.d(new StringBuilder("ErrorState(avatar="), this.b, ')');
        }
    }

    /* compiled from: ClipsInterestsState.kt */
    public static final class b implements ClipsInterestsState {
        public static final b b = new b();
    }

    /* compiled from: ClipsInterestsState.kt */
    public static final class c implements ClipsInterestsState {
        public final Image b;

        public c(Image image) {
            this.b = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            Image image = this.b;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        public final String toString() {
            return er.d(new StringBuilder("Loading(avatar="), this.b, ')');
        }
    }
}
