package com.vk.core.voip;

import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: VoipCallSource.kt */
/* loaded from: classes.dex */
public final class VoipCallSource extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VoipCallSource> CREATOR = new b();
    public final MobileOfficialAppsCallsStat$TypeVoipCallItem.Source b;
    public final MobileOfficialAppsCoreNavStat$EventScreen c;

    /* compiled from: VoipCallSource.kt */
    public static final class a {
        public static VoipCallSource a() {
            UiTracker uiTracker = UiTracker.a;
            return new VoipCallSource(null, UiTracker.c());
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VoipCallSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VoipCallSource a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            if (H2 != null) {
                return new VoipCallSource(H != null ? MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.valueOf(H) : null, MobileOfficialAppsCoreNavStat$EventScreen.valueOf(H2));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoipCallSource[i];
        }
    }

    public VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.b = source;
        this.c = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = this.b;
        serializer.j0(source != null ? source.name() : null);
        serializer.j0(this.c.name());
    }
}
