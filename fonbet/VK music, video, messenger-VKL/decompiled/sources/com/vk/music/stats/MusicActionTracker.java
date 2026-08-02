package com.vk.music.stats;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: MusicActionTracker.kt */
/* loaded from: classes3.dex */
public interface MusicActionTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicActionTracker.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action AddToMe;
        public static final Action AddToPlaylist;
        public static final Action AddToStory;
        public static final Action Broadcast;
        public static final Action CopyLink;
        public static final Action Download;
        public static final Action Fave;
        public static final Action GoToArtist;
        public static final Action ListenNext;
        public static final Action MixAllTracks;
        public static final Action OpenAlbum;
        public static final Action Pause;
        public static final Action Play;
        public static final Action PlayAll;
        public static final Action RemoveFromMe;
        public static final Action SetSleepTimer;
        public static final Action Share;
        public static final Action ShowSimilar;
        public static final Action Unfave;

        static {
            Action action = new Action("MixAllTracks", 0);
            MixAllTracks = action;
            Action action2 = new Action("PlayAll", 1);
            PlayAll = action2;
            Action action3 = new Action("Download", 2);
            Download = action3;
            Action action4 = new Action("AddToMe", 3);
            AddToMe = action4;
            Action action5 = new Action("RemoveFromMe", 4);
            RemoveFromMe = action5;
            Action action6 = new Action("ListenNext", 5);
            ListenNext = action6;
            Action action7 = new Action("GoToArtist", 6);
            GoToArtist = action7;
            Action action8 = new Action("Share", 7);
            Share = action8;
            Action action9 = new Action("CopyLink", 8);
            CopyLink = action9;
            Action action10 = new Action("Play", 9);
            Play = action10;
            Action action11 = new Action("Pause", 10);
            Pause = action11;
            Action action12 = new Action("OpenAlbum", 11);
            OpenAlbum = action12;
            Action action13 = new Action("ShowSimilar", 12);
            ShowSimilar = action13;
            Action action14 = new Action("AddToPlaylist", 13);
            AddToPlaylist = action14;
            Action action15 = new Action("SetSleepTimer", 14);
            SetSleepTimer = action15;
            Action action16 = new Action("Broadcast", 15);
            Broadcast = action16;
            Action action17 = new Action("Fave", 16);
            Fave = action17;
            Action action18 = new Action("Unfave", 17);
            Unfave = action18;
            Action action19 = new Action("AddToStory", 18);
            AddToStory = action19;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15, action16, action17, action18, action19};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicActionTracker.kt */
    public static abstract class a {

        /* compiled from: MusicActionTracker.kt */
        /* renamed from: com.vk.music.stats.MusicActionTracker$a$a, reason: collision with other inner class name */
        public static final class C1355a extends a {
            public static final C1355a a = new C1355a();
        }

        /* compiled from: MusicActionTracker.kt */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Track(trackCode="), this.a, ')');
            }
        }
    }

    void a(Action action, a aVar);
}
