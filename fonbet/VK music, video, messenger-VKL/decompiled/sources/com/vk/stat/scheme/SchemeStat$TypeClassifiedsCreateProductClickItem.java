package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsCreateProductClickItem {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("posting_form")
    private final PostingForm postingForm;

    @pmi0("posting_source")
    private final PostingSource postingSource;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostingForm {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostingForm[] $VALUES;

        @pmi0("auto_recognition")
        public static final PostingForm AUTO_RECOGNITION;

        @pmi0("native_create")
        public static final PostingForm NATIVE_CREATE;

        @pmi0("native_create_recognition")
        public static final PostingForm NATIVE_CREATE_RECOGNITION;

        @pmi0("simple_create_hidden")
        public static final PostingForm SIMPLE_CREATE_HIDDEN;

        static {
            PostingForm postingForm = new PostingForm("NATIVE_CREATE", 0);
            NATIVE_CREATE = postingForm;
            PostingForm postingForm2 = new PostingForm("NATIVE_CREATE_RECOGNITION", 1);
            NATIVE_CREATE_RECOGNITION = postingForm2;
            PostingForm postingForm3 = new PostingForm("AUTO_RECOGNITION", 2);
            AUTO_RECOGNITION = postingForm3;
            PostingForm postingForm4 = new PostingForm("SIMPLE_CREATE_HIDDEN", 3);
            SIMPLE_CREATE_HIDDEN = postingForm4;
            PostingForm[] postingFormArr = {postingForm, postingForm2, postingForm3, postingForm4};
            $VALUES = postingFormArr;
            $ENTRIES = new asp(postingFormArr);
        }

        private PostingForm(String str, int i) {
        }

        public static PostingForm valueOf(String str) {
            return (PostingForm) Enum.valueOf(PostingForm.class, str);
        }

        public static PostingForm[] values() {
            return (PostingForm[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostingSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostingSource[] $VALUES;

        @pmi0("add")
        public static final PostingSource ADD;

        @pmi0("anticlassified")
        public static final PostingSource ANTICLASSIFIED;

        @pmi0("collection")
        public static final PostingSource COLLECTION;

        @pmi0("community_action")
        public static final PostingSource COMMUNITY_ACTION;

        @pmi0("crossposting_wall")
        public static final PostingSource CROSSPOSTING_WALL;

        @pmi0("empty_widget")
        public static final PostingSource EMPTY_WIDGET;

        @pmi0("main_category")
        public static final PostingSource MAIN_CATEGORY;

        @pmi0("main_section")
        public static final PostingSource MAIN_SECTION;

        @pmi0("onboarding_block")
        public static final PostingSource ONBOARDING_BLOCK;

        @pmi0("post_bottom_menu")
        public static final PostingSource POST_BOTTOM_MENU;

        @pmi0("wall")
        public static final PostingSource WALL;

        static {
            PostingSource postingSource = new PostingSource("MAIN_SECTION", 0);
            MAIN_SECTION = postingSource;
            PostingSource postingSource2 = new PostingSource("MAIN_CATEGORY", 1);
            MAIN_CATEGORY = postingSource2;
            PostingSource postingSource3 = new PostingSource("COLLECTION", 2);
            COLLECTION = postingSource3;
            PostingSource postingSource4 = new PostingSource("COMMUNITY_ACTION", 3);
            COMMUNITY_ACTION = postingSource4;
            PostingSource postingSource5 = new PostingSource("ANTICLASSIFIED", 4);
            ANTICLASSIFIED = postingSource5;
            PostingSource postingSource6 = new PostingSource("POST_BOTTOM_MENU", 5);
            POST_BOTTOM_MENU = postingSource6;
            PostingSource postingSource7 = new PostingSource("EMPTY_WIDGET", 6);
            EMPTY_WIDGET = postingSource7;
            PostingSource postingSource8 = new PostingSource("WALL", 7);
            WALL = postingSource8;
            PostingSource postingSource9 = new PostingSource("CROSSPOSTING_WALL", 8);
            CROSSPOSTING_WALL = postingSource9;
            PostingSource postingSource10 = new PostingSource("ONBOARDING_BLOCK", 9);
            ONBOARDING_BLOCK = postingSource10;
            PostingSource postingSource11 = new PostingSource("ADD", 10);
            ADD = postingSource11;
            PostingSource[] postingSourceArr = {postingSource, postingSource2, postingSource3, postingSource4, postingSource5, postingSource6, postingSource7, postingSource8, postingSource9, postingSource10, postingSource11};
            $VALUES = postingSourceArr;
            $ENTRIES = new asp(postingSourceArr);
        }

        private PostingSource(String str, int i) {
        }

        public static PostingSource valueOf(String str) {
            return (PostingSource) Enum.valueOf(PostingSource.class, str);
        }

        public static PostingSource[] values() {
            return (PostingSource[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClassifiedsCreateProductClickItem(long j, String str, PostingSource postingSource, PostingForm postingForm) {
        this.ownerId = j;
        this.url = str;
        this.postingSource = postingSource;
        this.postingForm = postingForm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsCreateProductClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem = (SchemeStat$TypeClassifiedsCreateProductClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsCreateProductClickItem.ownerId && epx.f(this.url, schemeStat$TypeClassifiedsCreateProductClickItem.url) && this.postingSource == schemeStat$TypeClassifiedsCreateProductClickItem.postingSource && this.postingForm == schemeStat$TypeClassifiedsCreateProductClickItem.postingForm;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PostingSource postingSource = this.postingSource;
        int hashCode3 = (hashCode2 + (postingSource == null ? 0 : postingSource.hashCode())) * 31;
        PostingForm postingForm = this.postingForm;
        return hashCode3 + (postingForm != null ? postingForm.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsCreateProductClickItem(ownerId=" + this.ownerId + ", url=" + this.url + ", postingSource=" + this.postingSource + ", postingForm=" + this.postingForm + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsCreateProductClickItem(long j, String str, PostingSource postingSource, PostingForm postingForm, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : postingSource, (i & 8) != 0 ? null : postingForm);
    }
}
