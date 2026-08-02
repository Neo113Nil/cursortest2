package ru.ozon.app.android.search.widgets.suggestion.data;

import Jb.e;

/* loaded from: classes13.dex */
public final class SuggestionMapper_Factory implements e<SuggestionMapper> {

    private static final class InstanceHolder {
        private static final SuggestionMapper_Factory INSTANCE = new SuggestionMapper_Factory();
    }

    public static SuggestionMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SuggestionMapper newInstance() {
        return new SuggestionMapper();
    }

    @Override // Pc.a
    public SuggestionMapper get() {
        return newInstance();
    }
}
