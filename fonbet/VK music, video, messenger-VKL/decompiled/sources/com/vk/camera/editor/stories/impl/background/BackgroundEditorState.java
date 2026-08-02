package com.vk.camera.editor.stories.impl.background;

import android.graphics.Bitmap;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.asp;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.mat0;
import xsna.on00;
import xsna.qoy;
import xsna.qyl0;
import xsna.rl3;
import xsna.syl0;
import xsna.t2l0;
import xsna.zrp;

/* compiled from: BackgroundEditorState.kt */
/* loaded from: classes16.dex */
public final class BackgroundEditorState {
    public final Map<StoryBackgroundType, List<qyl0>> a;
    public final List<syl0> b;
    public final StoryBackgroundType c;
    public final Bitmap d;
    public final Bitmap e;
    public final Bitmap f;
    public final boolean g;
    public final boolean h;
    public final Bitmap i;
    public final List<mat0> j;
    public final qyl0 k;
    public final Bitmap l;
    public final mat0 m;
    public final StoryBackgroundState n;
    public final t2l0 o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BackgroundEditorState.kt */
    public static final class StoryBackgroundState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoryBackgroundState[] $VALUES;
        public static final StoryBackgroundState DEFAULT;
        public static final StoryBackgroundState PIPETTE_PICKER;

        static {
            StoryBackgroundState storyBackgroundState = new StoryBackgroundState("PIPETTE_PICKER", 0);
            PIPETTE_PICKER = storyBackgroundState;
            StoryBackgroundState storyBackgroundState2 = new StoryBackgroundState("DEFAULT", 1);
            DEFAULT = storyBackgroundState2;
            StoryBackgroundState[] storyBackgroundStateArr = {storyBackgroundState, storyBackgroundState2};
            $VALUES = storyBackgroundStateArr;
            $ENTRIES = new asp(storyBackgroundStateArr);
        }

        public StoryBackgroundState() {
            throw null;
        }

        public static StoryBackgroundState valueOf(String str) {
            return (StoryBackgroundState) Enum.valueOf(StoryBackgroundState.class, str);
        }

        public static StoryBackgroundState[] values() {
            return (StoryBackgroundState[]) $VALUES.clone();
        }
    }

    public BackgroundEditorState() {
        this(OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
    }

    public static BackgroundEditorState a(BackgroundEditorState backgroundEditorState, LinkedHashMap linkedHashMap, List list, StoryBackgroundType storyBackgroundType, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, boolean z, boolean z2, Bitmap bitmap4, qyl0 qyl0Var, Bitmap bitmap5, mat0 mat0Var, StoryBackgroundState storyBackgroundState, t2l0 t2l0Var, int i) {
        Map<StoryBackgroundType, List<qyl0>> map = (i & 1) != 0 ? backgroundEditorState.a : linkedHashMap;
        List list2 = (i & 2) != 0 ? backgroundEditorState.b : list;
        StoryBackgroundType storyBackgroundType2 = (i & 4) != 0 ? backgroundEditorState.c : storyBackgroundType;
        Bitmap bitmap6 = (i & 8) != 0 ? backgroundEditorState.d : bitmap;
        Bitmap bitmap7 = (i & 16) != 0 ? backgroundEditorState.e : bitmap2;
        Bitmap bitmap8 = (i & 32) != 0 ? backgroundEditorState.f : bitmap3;
        boolean z3 = (i & 64) != 0 ? backgroundEditorState.g : z;
        boolean z4 = (i & 128) != 0 ? backgroundEditorState.h : z2;
        Bitmap bitmap9 = (i & 256) != 0 ? backgroundEditorState.i : bitmap4;
        List<mat0> list3 = (i & 512) != 0 ? backgroundEditorState.j : null;
        qyl0 qyl0Var2 = (i & 1024) != 0 ? backgroundEditorState.k : qyl0Var;
        Bitmap bitmap10 = (i & 2048) != 0 ? backgroundEditorState.l : bitmap5;
        mat0 mat0Var2 = (i & 4096) != 0 ? backgroundEditorState.m : mat0Var;
        StoryBackgroundState storyBackgroundState2 = (i & 8192) != 0 ? backgroundEditorState.n : storyBackgroundState;
        t2l0 t2l0Var2 = (i & 16384) != 0 ? backgroundEditorState.o : t2l0Var;
        backgroundEditorState.getClass();
        return new BackgroundEditorState(map, list2, storyBackgroundType2, bitmap6, bitmap7, bitmap8, z3, z4, bitmap9, list3, qyl0Var2, bitmap10, mat0Var2, storyBackgroundState2, t2l0Var2);
    }

    public final qyl0 b() {
        Object obj;
        Iterator it = c5g.v(this.a.values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qyl0) obj).c) {
                break;
            }
        }
        return (qyl0) obj;
    }

    public final BackgroundEditorState c() {
        return a(this, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 24807);
    }

    public final BackgroundEditorState d(StoryBackgroundType storyBackgroundType) {
        return a(this, null, null, storyBackgroundType, null, null, null, false, false, null, null, null, null, null, null, 32763);
    }

    public final BackgroundEditorState e(qyl0 qyl0Var) {
        Map<StoryBackgroundType, List<qyl0>> map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Iterable<qyl0> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            for (qyl0 qyl0Var2 : iterable) {
                qyl0 c = qyl0.c(qyl0Var2, null, false, 3);
                c.c = qyl0Var2.equals(qyl0Var);
                arrayList.add(c);
            }
            linkedHashMap.put(key, arrayList);
        }
        return a(this, new LinkedHashMap(linkedHashMap), null, null, null, null, null, false, false, null, null, null, null, null, null, 32766);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundEditorState)) {
            return false;
        }
        BackgroundEditorState backgroundEditorState = (BackgroundEditorState) obj;
        return epx.f(this.a, backgroundEditorState.a) && epx.f(this.b, backgroundEditorState.b) && this.c == backgroundEditorState.c && epx.f(this.d, backgroundEditorState.d) && epx.f(this.e, backgroundEditorState.e) && epx.f(this.f, backgroundEditorState.f) && this.g == backgroundEditorState.g && this.h == backgroundEditorState.h && epx.f(this.i, backgroundEditorState.i) && epx.f(this.j, backgroundEditorState.j) && epx.f(this.k, backgroundEditorState.k) && epx.f(this.l, backgroundEditorState.l) && epx.f(this.m, backgroundEditorState.m) && this.n == backgroundEditorState.n && epx.f(this.o, backgroundEditorState.o);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        Bitmap bitmap = this.d;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.e;
        int hashCode3 = (hashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.f;
        int b = qoy.b(qoy.b((hashCode3 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31, 31, this.g), 31, this.h);
        Bitmap bitmap4 = this.i;
        int hashCode4 = (b + (bitmap4 == null ? 0 : bitmap4.hashCode())) * 31;
        List<mat0> list = this.j;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        qyl0 qyl0Var = this.k;
        int hashCode6 = (hashCode5 + (qyl0Var == null ? 0 : qyl0Var.hashCode())) * 31;
        Bitmap bitmap5 = this.l;
        int hashCode7 = (hashCode6 + (bitmap5 == null ? 0 : bitmap5.hashCode())) * 31;
        mat0 mat0Var = this.m;
        int hashCode8 = (this.n.hashCode() + ((hashCode7 + (mat0Var == null ? 0 : mat0Var.hashCode())) * 31)) * 31;
        t2l0 t2l0Var = this.o;
        return hashCode8 + (t2l0Var != null ? t2l0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundEditorState(backgroundItems=" + this.a + ", backgroundTypes=" + this.b + ", selectedBackgroundType=" + this.c + ", selectedBackgroundBitmap=" + this.d + ", previousBackgroundBitmap=" + this.e + ", bitmapForBlur=" + this.f + ", allowAnimatedBackground=" + this.g + ", hasAppliedBackground=" + this.h + ", userBackgroundBitmap=" + this.i + ", userBackgroundVideo=" + this.j + ", initialBackgroundItem=" + this.k + ", initialBackgroundBitmap=" + this.l + ", initialBackgroundVideoRawData=" + this.m + ", currentMode=" + this.n + ", colorPipetteInfo=" + this.o + ')';
    }

    public BackgroundEditorState(Map<StoryBackgroundType, List<qyl0>> map, List<syl0> list, StoryBackgroundType storyBackgroundType, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, boolean z, boolean z2, Bitmap bitmap4, List<mat0> list2, qyl0 qyl0Var, Bitmap bitmap5, mat0 mat0Var, StoryBackgroundState storyBackgroundState, t2l0 t2l0Var) {
        this.a = map;
        this.b = list;
        this.c = storyBackgroundType;
        this.d = bitmap;
        this.e = bitmap2;
        this.f = bitmap3;
        this.g = z;
        this.h = z2;
        this.i = bitmap4;
        this.j = list2;
        this.k = qyl0Var;
        this.l = bitmap5;
        this.m = mat0Var;
        this.n = storyBackgroundState;
        this.o = t2l0Var;
    }

    public BackgroundEditorState(int i, LinkedHashMap linkedHashMap) {
        this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap, rl3.I(new syl0[]{new syl0(StoryBackgroundType.COLOR), new syl0(StoryBackgroundType.GRAPHICS)}), StoryBackgroundType.BLUR, null, null, null, false, false, null, null, null, null, null, StoryBackgroundState.DEFAULT, null);
    }
}
