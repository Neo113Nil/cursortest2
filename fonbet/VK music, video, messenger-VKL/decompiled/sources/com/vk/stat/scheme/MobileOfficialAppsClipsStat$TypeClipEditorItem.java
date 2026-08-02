package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipEditorItem implements SchemeStat$TypeAction.b {

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("type")
    private final Type type;

    @pmi0("type_add_fragment")
    private final MobileOfficialAppsClipsStat$TypeAddFragment typeAddFragment;

    @pmi0("type_clip_draft")
    private final MobileOfficialAppsClipsStat$TypeClipDraft typeClipDraft;

    @pmi0("type_clip_preview")
    private final MobileOfficialAppsClipsStat$TypeClipPreview typeClipPreview;

    @pmi0("type_download_clip")
    private final MobileOfficialAppsClipsStat$TypeDownloadClip typeDownloadClip;

    @pmi0("type_editor_common")
    private final MobileOfficialAppsClipsStat$TypeEditorCommon typeEditorCommon;

    @pmi0("type_mute")
    private final MobileOfficialAppsClipsStat$TypeMute typeMute;

    @pmi0("type_undo_redo")
    private final MobileOfficialAppsClipsStat$TypeUndoRedo typeUndoRedo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_add_fragment")
        public static final Type TYPE_ADD_FRAGMENT;

        @pmi0("type_clip_draft")
        public static final Type TYPE_CLIP_DRAFT;

        @pmi0("type_clip_preview")
        public static final Type TYPE_CLIP_PREVIEW;

        @pmi0("type_download_clip")
        public static final Type TYPE_DOWNLOAD_CLIP;

        @pmi0("type_editor_common")
        public static final Type TYPE_EDITOR_COMMON;

        @pmi0("type_mute")
        public static final Type TYPE_MUTE;

        @pmi0("type_undo_redo")
        public static final Type TYPE_UNDO_REDO;

        static {
            Type type = new Type("TYPE_EDITOR_COMMON", 0);
            TYPE_EDITOR_COMMON = type;
            Type type2 = new Type("TYPE_UNDO_REDO", 1);
            TYPE_UNDO_REDO = type2;
            Type type3 = new Type("TYPE_MUTE", 2);
            TYPE_MUTE = type3;
            Type type4 = new Type("TYPE_CLIP_DRAFT", 3);
            TYPE_CLIP_DRAFT = type4;
            Type type5 = new Type("TYPE_ADD_FRAGMENT", 4);
            TYPE_ADD_FRAGMENT = type5;
            Type type6 = new Type("TYPE_DOWNLOAD_CLIP", 5);
            TYPE_DOWNLOAD_CLIP = type6;
            Type type7 = new Type("TYPE_CLIP_PREVIEW", 6);
            TYPE_CLIP_PREVIEW = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public interface a {
    }

    private MobileOfficialAppsClipsStat$TypeClipEditorItem(MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, Type type, MobileOfficialAppsClipsStat$TypeEditorCommon mobileOfficialAppsClipsStat$TypeEditorCommon, MobileOfficialAppsClipsStat$TypeUndoRedo mobileOfficialAppsClipsStat$TypeUndoRedo, MobileOfficialAppsClipsStat$TypeMute mobileOfficialAppsClipsStat$TypeMute, MobileOfficialAppsClipsStat$TypeClipDraft mobileOfficialAppsClipsStat$TypeClipDraft, MobileOfficialAppsClipsStat$TypeAddFragment mobileOfficialAppsClipsStat$TypeAddFragment, MobileOfficialAppsClipsStat$TypeDownloadClip mobileOfficialAppsClipsStat$TypeDownloadClip, MobileOfficialAppsClipsStat$TypeClipPreview mobileOfficialAppsClipsStat$TypeClipPreview) {
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
        this.type = type;
        this.typeEditorCommon = mobileOfficialAppsClipsStat$TypeEditorCommon;
        this.typeUndoRedo = mobileOfficialAppsClipsStat$TypeUndoRedo;
        this.typeMute = mobileOfficialAppsClipsStat$TypeMute;
        this.typeClipDraft = mobileOfficialAppsClipsStat$TypeClipDraft;
        this.typeAddFragment = mobileOfficialAppsClipsStat$TypeAddFragment;
        this.typeDownloadClip = mobileOfficialAppsClipsStat$TypeDownloadClip;
        this.typeClipPreview = mobileOfficialAppsClipsStat$TypeClipPreview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipEditorItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipEditorItem mobileOfficialAppsClipsStat$TypeClipEditorItem = (MobileOfficialAppsClipsStat$TypeClipEditorItem) obj;
        return epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipEditorItem.clipsCreateContext) && this.type == mobileOfficialAppsClipsStat$TypeClipEditorItem.type && epx.f(this.typeEditorCommon, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeEditorCommon) && epx.f(this.typeUndoRedo, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeUndoRedo) && epx.f(this.typeMute, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeMute) && epx.f(this.typeClipDraft, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeClipDraft) && epx.f(this.typeAddFragment, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeAddFragment) && epx.f(this.typeDownloadClip, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeDownloadClip) && epx.f(this.typeClipPreview, mobileOfficialAppsClipsStat$TypeClipEditorItem.typeClipPreview);
    }

    public final int hashCode() {
        int hashCode = this.clipsCreateContext.hashCode() * 31;
        Type type = this.type;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeEditorCommon mobileOfficialAppsClipsStat$TypeEditorCommon = this.typeEditorCommon;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsClipsStat$TypeEditorCommon == null ? 0 : mobileOfficialAppsClipsStat$TypeEditorCommon.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeUndoRedo mobileOfficialAppsClipsStat$TypeUndoRedo = this.typeUndoRedo;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsClipsStat$TypeUndoRedo == null ? 0 : mobileOfficialAppsClipsStat$TypeUndoRedo.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeMute mobileOfficialAppsClipsStat$TypeMute = this.typeMute;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsClipsStat$TypeMute == null ? 0 : mobileOfficialAppsClipsStat$TypeMute.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipDraft mobileOfficialAppsClipsStat$TypeClipDraft = this.typeClipDraft;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsClipsStat$TypeClipDraft == null ? 0 : mobileOfficialAppsClipsStat$TypeClipDraft.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeAddFragment mobileOfficialAppsClipsStat$TypeAddFragment = this.typeAddFragment;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsClipsStat$TypeAddFragment == null ? 0 : mobileOfficialAppsClipsStat$TypeAddFragment.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeDownloadClip mobileOfficialAppsClipsStat$TypeDownloadClip = this.typeDownloadClip;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsClipsStat$TypeDownloadClip == null ? 0 : mobileOfficialAppsClipsStat$TypeDownloadClip.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipPreview mobileOfficialAppsClipsStat$TypeClipPreview = this.typeClipPreview;
        return hashCode8 + (mobileOfficialAppsClipsStat$TypeClipPreview != null ? mobileOfficialAppsClipsStat$TypeClipPreview.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipEditorItem(clipsCreateContext=" + this.clipsCreateContext + ", type=" + this.type + ", typeEditorCommon=" + this.typeEditorCommon + ", typeUndoRedo=" + this.typeUndoRedo + ", typeMute=" + this.typeMute + ", typeClipDraft=" + this.typeClipDraft + ", typeAddFragment=" + this.typeAddFragment + ", typeDownloadClip=" + this.typeDownloadClip + ", typeClipPreview=" + this.typeClipPreview + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipEditorItem(MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, Type type, MobileOfficialAppsClipsStat$TypeEditorCommon mobileOfficialAppsClipsStat$TypeEditorCommon, MobileOfficialAppsClipsStat$TypeUndoRedo mobileOfficialAppsClipsStat$TypeUndoRedo, MobileOfficialAppsClipsStat$TypeMute mobileOfficialAppsClipsStat$TypeMute, MobileOfficialAppsClipsStat$TypeClipDraft mobileOfficialAppsClipsStat$TypeClipDraft, MobileOfficialAppsClipsStat$TypeAddFragment mobileOfficialAppsClipsStat$TypeAddFragment, MobileOfficialAppsClipsStat$TypeDownloadClip mobileOfficialAppsClipsStat$TypeDownloadClip, MobileOfficialAppsClipsStat$TypeClipPreview mobileOfficialAppsClipsStat$TypeClipPreview, int i, zcl zclVar) {
        this(mobileOfficialAppsClipsStat$ClipsCreateContext, (i & 2) != 0 ? null : type, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$TypeEditorCommon, (i & 8) != 0 ? null : mobileOfficialAppsClipsStat$TypeUndoRedo, (i & 16) != 0 ? null : mobileOfficialAppsClipsStat$TypeMute, (i & 32) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipDraft, (i & 64) != 0 ? null : mobileOfficialAppsClipsStat$TypeAddFragment, (i & 128) != 0 ? null : mobileOfficialAppsClipsStat$TypeDownloadClip, (i & 256) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipPreview);
    }
}
