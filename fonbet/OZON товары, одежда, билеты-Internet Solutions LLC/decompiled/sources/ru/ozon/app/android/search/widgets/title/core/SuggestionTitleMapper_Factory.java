package ru.ozon.app.android.search.widgets.title.core;

import Jb.e;

/* loaded from: classes13.dex */
public final class SuggestionTitleMapper_Factory implements e<SuggestionTitleMapper> {

    private static final class InstanceHolder {
        private static final SuggestionTitleMapper_Factory INSTANCE = new SuggestionTitleMapper_Factory();
    }

    public static SuggestionTitleMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SuggestionTitleMapper newInstance() {
        return new SuggestionTitleMapper();
    }

    @Override // Pc.a
    public SuggestionTitleMapper get() {
        return newInstance();
    }
}
