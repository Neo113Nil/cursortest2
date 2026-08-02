package ru.ozon.app.android.common.taglist.common;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;

/* loaded from: classes11.dex */
public final class TagListOnboardingDisplayRepository_Factory implements e<TagListOnboardingDisplayRepository> {
    private final a<SharedPreferences> sharedPreferencesProvider;

    public TagListOnboardingDisplayRepository_Factory(a<SharedPreferences> aVar) {
        this.sharedPreferencesProvider = aVar;
    }

    public static TagListOnboardingDisplayRepository_Factory create(a<SharedPreferences> aVar) {
        return new TagListOnboardingDisplayRepository_Factory(aVar);
    }

    public static TagListOnboardingDisplayRepository newInstance(SharedPreferences sharedPreferences) {
        return new TagListOnboardingDisplayRepository(sharedPreferences);
    }

    @Override // Pc.a
    public TagListOnboardingDisplayRepository get() {
        return newInstance(this.sharedPreferencesProvider.get());
    }
}
