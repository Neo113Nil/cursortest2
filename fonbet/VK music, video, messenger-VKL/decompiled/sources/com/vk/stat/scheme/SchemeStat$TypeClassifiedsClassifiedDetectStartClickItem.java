package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem {

    @pmi0("owner_id")
    private final long ownerId;

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

        @pmi0("auto_recognition")
        public static final PostingForm AUTO_RECOGNITION;

        @pmi0("native_create")
        public static final PostingForm NATIVE_CREATE;

        @pmi0("native_create_recognition")
        public static final PostingForm NATIVE_CREATE_RECOGNITION;

        static {
            PostingForm postingForm = new PostingForm("NATIVE_CREATE", 0);
            NATIVE_CREATE = postingForm;
            PostingForm postingForm2 = new PostingForm("NATIVE_CREATE_RECOGNITION", 1);
            NATIVE_CREATE_RECOGNITION = postingForm2;
            PostingForm postingForm3 = new PostingForm("AUTO_RECOGNITION", 2);
            AUTO_RECOGNITION = postingForm3;
            PostingForm[] postingFormArr = {postingForm, postingForm2, postingForm3};
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

        @pmi0("community_action")
        public static final PostingSource COMMUNITY_ACTION;

        @pmi0("crossposting_wall")
        public static final PostingSource CROSSPOSTING_WALL;

        @pmi0("wall")
        public static final PostingSource WALL;

        static {
            PostingSource postingSource = new PostingSource("WALL", 0);
            WALL = postingSource;
            PostingSource postingSource2 = new PostingSource("CROSSPOSTING_WALL", 1);
            CROSSPOSTING_WALL = postingSource2;
            PostingSource postingSource3 = new PostingSource("COMMUNITY_ACTION", 2);
            COMMUNITY_ACTION = postingSource3;
            PostingSource[] postingSourceArr = {postingSource, postingSource2, postingSource3};
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

    public SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem(long j, PostingSource postingSource, PostingForm postingForm) {
        this.ownerId = j;
        this.postingSource = postingSource;
        this.postingForm = postingForm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem schemeStat$TypeClassifiedsClassifiedDetectStartClickItem = (SchemeStat$TypeClassifiedsClassifiedDetectStartClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsClassifiedDetectStartClickItem.ownerId && this.postingSource == schemeStat$TypeClassifiedsClassifiedDetectStartClickItem.postingSource && this.postingForm == schemeStat$TypeClassifiedsClassifiedDetectStartClickItem.postingForm;
    }

    public final int hashCode() {
        return this.postingForm.hashCode() + ((this.postingSource.hashCode() + (Long.hashCode(this.ownerId) * 31)) * 31);
    }

    public final String toString() {
        return "TypeClassifiedsClassifiedDetectStartClickItem(ownerId=" + this.ownerId + ", postingSource=" + this.postingSource + ", postingForm=" + this.postingForm + ')';
    }
}
