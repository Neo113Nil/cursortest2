package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieFeatureFlag;
import xsna.eij;
import xsna.gfj;
import xsna.i700;
import xsna.k800;
import xsna.n100;
import xsna.y820;

/* loaded from: classes12.dex */
public final class MergePaths implements eij {
    public final MergePathsMode a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MergePathsMode {
        private static final /* synthetic */ MergePathsMode[] $VALUES;
        public static final MergePathsMode ADD;
        public static final MergePathsMode EXCLUDE_INTERSECTIONS;
        public static final MergePathsMode INTERSECT;
        public static final MergePathsMode MERGE;
        public static final MergePathsMode SUBTRACT;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            MERGE = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            ADD = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            SUBTRACT = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            INTERSECT = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            EXCLUDE_INTERSECTIONS = mergePathsMode5;
            $VALUES = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public MergePathsMode() {
            throw null;
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) $VALUES.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.a = mergePathsMode;
        this.b = z;
    }

    @Override // xsna.eij
    @Nullable
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        if (k800Var.o.a.contains(LottieFeatureFlag.MergePathsApi19)) {
            return new y820(this);
        }
        n100.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.a + '}';
    }
}
