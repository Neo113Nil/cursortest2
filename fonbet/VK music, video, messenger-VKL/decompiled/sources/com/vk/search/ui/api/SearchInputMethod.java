package com.vk.search.ui.api;

import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.icw0;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchInputMethod.kt */
/* loaded from: classes5.dex */
public final class SearchInputMethod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchInputMethod[] $VALUES;
    public static final a Companion;
    public static final SearchInputMethod GoogleVoice;
    public static final SearchInputMethod Keyboard;

    @ozl
    public static final SearchInputMethod Marusia;
    public static final SearchInputMethod Preset;
    public static final SearchInputMethod QueryViewClick;
    public static final SearchInputMethod Suggest;

    /* compiled from: SearchInputMethod.kt */
    public static final class a {
        public static SearchInputMethod a(icw0 icw0Var) {
            if (icw0Var.equals(icw0.a.a)) {
                return SearchInputMethod.GoogleVoice;
            }
            if (icw0Var.equals(icw0.b.a)) {
                return SearchInputMethod.Marusia;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        SearchInputMethod searchInputMethod = new SearchInputMethod("Keyboard", 0);
        Keyboard = searchInputMethod;
        SearchInputMethod searchInputMethod2 = new SearchInputMethod("Preset", 1);
        Preset = searchInputMethod2;
        SearchInputMethod searchInputMethod3 = new SearchInputMethod("GoogleVoice", 2);
        GoogleVoice = searchInputMethod3;
        SearchInputMethod searchInputMethod4 = new SearchInputMethod("Marusia", 3);
        Marusia = searchInputMethod4;
        SearchInputMethod searchInputMethod5 = new SearchInputMethod("Suggest", 4);
        Suggest = searchInputMethod5;
        SearchInputMethod searchInputMethod6 = new SearchInputMethod("QueryViewClick", 5);
        QueryViewClick = searchInputMethod6;
        SearchInputMethod[] searchInputMethodArr = {searchInputMethod, searchInputMethod2, searchInputMethod3, searchInputMethod4, searchInputMethod5, searchInputMethod6};
        $VALUES = searchInputMethodArr;
        $ENTRIES = new asp(searchInputMethodArr);
        Companion = new a();
    }

    public SearchInputMethod() {
        throw null;
    }

    public static SearchInputMethod valueOf(String str) {
        return (SearchInputMethod) Enum.valueOf(SearchInputMethod.class, str);
    }

    public static SearchInputMethod[] values() {
        return (SearchInputMethod[]) $VALUES.clone();
    }
}
