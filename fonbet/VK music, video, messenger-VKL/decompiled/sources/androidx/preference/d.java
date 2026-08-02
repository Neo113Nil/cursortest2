package androidx.preference;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import androidx.preference.c;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes12.dex */
public final class d implements Preference.c {
    public final /* synthetic */ PreferenceGroup b;
    public final /* synthetic */ c c;

    public d(c cVar, PreferenceGroup preferenceGroup) {
        this.c = cVar;
        this.b = preferenceGroup;
    }

    @Override // androidx.preference.Preference.c
    public final boolean eh(@NonNull Preference preference) {
        this.b.W = Integer.MAX_VALUE;
        c cVar = this.c;
        Handler handler = cVar.g;
        c.a aVar = cVar.h;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
        return true;
    }
}
