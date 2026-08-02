package com.vk.clips.favorites.impl.ui.folders.renaming;

import xsna.asp;
import xsna.epx;
import xsna.km50;
import xsna.zrp;

/* compiled from: ClipsFavoritesFolderRenamingState.kt */
/* loaded from: classes16.dex */
public final class ClipsFavoritesFolderRenamingState implements km50 {
    public final String b;
    public final SaveState c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsFavoritesFolderRenamingState.kt */
    public static final class SaveState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SaveState[] $VALUES;
        public static final SaveState Error;
        public static final SaveState Loading;
        public static final SaveState None;
        public static final SaveState Success;

        static {
            SaveState saveState = new SaveState("None", 0);
            None = saveState;
            SaveState saveState2 = new SaveState("Loading", 1);
            Loading = saveState2;
            SaveState saveState3 = new SaveState("Success", 2);
            Success = saveState3;
            SaveState saveState4 = new SaveState("Error", 3);
            Error = saveState4;
            SaveState[] saveStateArr = {saveState, saveState2, saveState3, saveState4};
            $VALUES = saveStateArr;
            $ENTRIES = new asp(saveStateArr);
        }

        public SaveState() {
            throw null;
        }

        public static SaveState valueOf(String str) {
            return (SaveState) Enum.valueOf(SaveState.class, str);
        }

        public static SaveState[] values() {
            return (SaveState[]) $VALUES.clone();
        }
    }

    public ClipsFavoritesFolderRenamingState(String str, SaveState saveState) {
        this.b = str;
        this.c = saveState;
    }

    public static ClipsFavoritesFolderRenamingState a(ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState, String str, SaveState saveState, int i) {
        if ((i & 1) != 0) {
            str = clipsFavoritesFolderRenamingState.b;
        }
        if ((i & 2) != 0) {
            saveState = clipsFavoritesFolderRenamingState.c;
        }
        clipsFavoritesFolderRenamingState.getClass();
        clipsFavoritesFolderRenamingState.getClass();
        return new ClipsFavoritesFolderRenamingState(str, saveState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsFavoritesFolderRenamingState)) {
            return false;
        }
        ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState = (ClipsFavoritesFolderRenamingState) obj;
        return epx.f(this.b, clipsFavoritesFolderRenamingState.b) && this.c == clipsFavoritesFolderRenamingState.c;
    }

    public final int hashCode() {
        return (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "ClipsFavoritesFolderRenamingState(folderName=" + this.b + ", saveState=" + this.c + ", savedFolder=null)";
    }
}
