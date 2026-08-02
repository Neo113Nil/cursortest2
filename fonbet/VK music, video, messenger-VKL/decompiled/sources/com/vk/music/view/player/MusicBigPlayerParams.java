package com.vk.music.view.player;

import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import io.reactivex.rxjava3.disposables.b;
import xsna.asp;
import xsna.epx;
import xsna.g9o;
import xsna.lq40;
import xsna.tb40;
import xsna.u2b0;
import xsna.u750;
import xsna.x5v0;
import xsna.zrp;

/* compiled from: MusicBigPlayerParams.kt */
/* loaded from: classes3.dex */
public final class MusicBigPlayerParams {
    public final tb40 a;
    public final g9o b;
    public final u2b0 c;
    public final com.vk.music.track.a d;
    public final u750 e;
    public final MusicRestrictionPopupDisplayer f;
    public final b g;
    public final x5v0 h;
    public final MusicPlayerPersistentBottomSheet i;
    public final FeatureSet j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicBigPlayerParams.kt */
    public static final class FeatureSet {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeatureSet[] $VALUES;
        public static final FeatureSet ALL;
        public static final FeatureSet LIMITED;
        public static final FeatureSet MESSENGER;
        private final boolean allAvailableActionItems;
        private final boolean defaultPlaceholderIconColor;
        private final boolean offlineMode;

        static {
            FeatureSet featureSet = new FeatureSet(0, "ALL", true, true, true);
            ALL = featureSet;
            FeatureSet featureSet2 = new FeatureSet(1, "LIMITED", false, false, false);
            LIMITED = featureSet2;
            FeatureSet featureSet3 = new FeatureSet(2, "MESSENGER", false, false, true);
            MESSENGER = featureSet3;
            FeatureSet[] featureSetArr = {featureSet, featureSet2, featureSet3};
            $VALUES = featureSetArr;
            $ENTRIES = new asp(featureSetArr);
        }

        public FeatureSet(int i, String str, boolean z, boolean z2, boolean z3) {
            this.offlineMode = z;
            this.defaultPlaceholderIconColor = z2;
            this.allAvailableActionItems = z3;
        }

        public static FeatureSet valueOf(String str) {
            return (FeatureSet) Enum.valueOf(FeatureSet.class, str);
        }

        public static FeatureSet[] values() {
            return (FeatureSet[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.allAvailableActionItems;
        }

        public final boolean i() {
            return this.defaultPlaceholderIconColor;
        }

        public final boolean j() {
            return this.offlineMode;
        }
    }

    public MusicBigPlayerParams(tb40 tb40Var, lq40 lq40Var, u2b0 u2b0Var, com.vk.music.track.a aVar, u750 u750Var, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, b bVar, x5v0 x5v0Var, MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet, FeatureSet featureSet) {
        this.a = tb40Var;
        this.b = lq40Var;
        this.c = u2b0Var;
        this.d = aVar;
        this.e = u750Var;
        this.f = musicRestrictionPopupDisplayer;
        this.g = bVar;
        this.h = x5v0Var;
        this.i = musicPlayerPersistentBottomSheet;
        this.j = featureSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBigPlayerParams)) {
            return false;
        }
        MusicBigPlayerParams musicBigPlayerParams = (MusicBigPlayerParams) obj;
        return this.a.equals(musicBigPlayerParams.a) && epx.f(this.b, musicBigPlayerParams.b) && epx.f(this.c, musicBigPlayerParams.c) && this.d.equals(musicBigPlayerParams.d) && epx.f(this.e, musicBigPlayerParams.e) && epx.f(this.f, musicBigPlayerParams.f) && this.g.equals(musicBigPlayerParams.g) && this.h.equals(musicBigPlayerParams.h) && this.i.equals(musicBigPlayerParams.i) && this.j == musicBigPlayerParams.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MusicBigPlayerParams(reducer=" + this.a + ", downloadModel=" + this.b + ", playerModel=" + this.c + ", musicTrackModel=" + this.d + ", musicStatsTracker=" + this.e + ", musicRestrictionPopupDisplayer=" + this.f + ", compositeDisposable=" + this.g + ", musicHintsManager=" + this.h + ", persistentBottomSheetController=" + this.i + ", featureSet=" + this.j + ')';
    }
}
