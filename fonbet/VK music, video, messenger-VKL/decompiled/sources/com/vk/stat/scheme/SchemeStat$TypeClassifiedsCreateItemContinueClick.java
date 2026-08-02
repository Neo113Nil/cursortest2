package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsCreateItemContinueClick {

    @pmi0("posting_form")
    private final PostingForm postingForm;

    @pmi0("posting_source")
    private final PostingSource postingSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostingForm {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostingForm[] $VALUES;

        @pmi0("simple_create_hidden")
        public static final PostingForm SIMPLE_CREATE_HIDDEN;

        static {
            PostingForm postingForm = new PostingForm("SIMPLE_CREATE_HIDDEN", 0);
            SIMPLE_CREATE_HIDDEN = postingForm;
            PostingForm[] postingFormArr = {postingForm};
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

        static {
            PostingSource postingSource = new PostingSource("ADD", 0);
            ADD = postingSource;
            PostingSource[] postingSourceArr = {postingSource};
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

    public SchemeStat$TypeClassifiedsCreateItemContinueClick(PostingSource postingSource, PostingForm postingForm) {
        this.postingSource = postingSource;
        this.postingForm = postingForm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsCreateItemContinueClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsCreateItemContinueClick schemeStat$TypeClassifiedsCreateItemContinueClick = (SchemeStat$TypeClassifiedsCreateItemContinueClick) obj;
        return this.postingSource == schemeStat$TypeClassifiedsCreateItemContinueClick.postingSource && this.postingForm == schemeStat$TypeClassifiedsCreateItemContinueClick.postingForm;
    }

    public final int hashCode() {
        return this.postingForm.hashCode() + (this.postingSource.hashCode() * 31);
    }

    public final String toString() {
        return "TypeClassifiedsCreateItemContinueClick(postingSource=" + this.postingSource + ", postingForm=" + this.postingForm + ')';
    }
}
