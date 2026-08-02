package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsCreateItemCategoryView {

    @pmi0("category_1")
    private final String category1;

    @pmi0("category_1_id")
    private final Integer category1Id;

    @pmi0("category_2")
    private final String category2;

    @pmi0("category_2_id")
    private final Integer category2Id;

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

    public SchemeStat$TypeClassifiedsCreateItemCategoryView(PostingSource postingSource, PostingForm postingForm, String str, Integer num, String str2, Integer num2) {
        this.postingSource = postingSource;
        this.postingForm = postingForm;
        this.category1 = str;
        this.category1Id = num;
        this.category2 = str2;
        this.category2Id = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsCreateItemCategoryView)) {
            return false;
        }
        SchemeStat$TypeClassifiedsCreateItemCategoryView schemeStat$TypeClassifiedsCreateItemCategoryView = (SchemeStat$TypeClassifiedsCreateItemCategoryView) obj;
        return this.postingSource == schemeStat$TypeClassifiedsCreateItemCategoryView.postingSource && this.postingForm == schemeStat$TypeClassifiedsCreateItemCategoryView.postingForm && epx.f(this.category1, schemeStat$TypeClassifiedsCreateItemCategoryView.category1) && epx.f(this.category1Id, schemeStat$TypeClassifiedsCreateItemCategoryView.category1Id) && epx.f(this.category2, schemeStat$TypeClassifiedsCreateItemCategoryView.category2) && epx.f(this.category2Id, schemeStat$TypeClassifiedsCreateItemCategoryView.category2Id);
    }

    public final int hashCode() {
        int hashCode = (this.postingForm.hashCode() + (this.postingSource.hashCode() * 31)) * 31;
        String str = this.category1;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.category1Id;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.category2;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.category2Id;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsCreateItemCategoryView(postingSource=");
        sb.append(this.postingSource);
        sb.append(", postingForm=");
        sb.append(this.postingForm);
        sb.append(", category1=");
        sb.append(this.category1);
        sb.append(", category1Id=");
        sb.append(this.category1Id);
        sb.append(", category2=");
        sb.append(this.category2);
        sb.append(", category2Id=");
        return uqi.b(sb, this.category2Id, ')');
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsCreateItemCategoryView(PostingSource postingSource, PostingForm postingForm, String str, Integer num, String str2, Integer num2, int i, zcl zclVar) {
        this(postingSource, postingForm, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num2);
    }
}
