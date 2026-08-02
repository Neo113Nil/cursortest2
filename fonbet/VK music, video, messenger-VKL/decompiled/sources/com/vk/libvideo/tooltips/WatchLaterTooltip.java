package com.vk.libvideo.tooltips;

import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.tooltips.VideoTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.asp;
import xsna.l7v;
import xsna.pla;
import xsna.zrp;

/* compiled from: WatchLaterTooltip.kt */
/* loaded from: classes3.dex */
public final class WatchLaterTooltip {
    public final View a;
    public final VideoTooltip b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WatchLaterTooltip.kt */
    public static final class Hint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Hint[] $VALUES;
        public static final Hint ACTION;
        public static final Hint BUTTON;
        public static final Hint MENU;
        private final HintId hintId;

        static {
            Hint hint = new Hint("MENU", 0, HintId.INFO_VIDEO_WATCH_LATER_MENU);
            MENU = hint;
            Hint hint2 = new Hint("BUTTON", 1, HintId.INFO_VIDEO_WATCH_LATER_BUTTON);
            BUTTON = hint2;
            Hint hint3 = new Hint("ACTION", 2, HintId.INFO_VIDEO_WATCH_LATER_ACTION);
            ACTION = hint3;
            Hint[] hintArr = {hint, hint2, hint3};
            $VALUES = hintArr;
            $ENTRIES = new asp(hintArr);
        }

        public Hint(String str, int i, HintId hintId) {
            this.hintId = hintId;
        }

        public static zrp<Hint> h() {
            return $ENTRIES;
        }

        public static Hint valueOf(String str) {
            return (Hint) Enum.valueOf(Hint.class, str);
        }

        public static Hint[] values() {
            return (Hint[]) $VALUES.clone();
        }

        public final HintId i() {
            return this.hintId;
        }
    }

    public WatchLaterTooltip(View view) {
        this.a = view;
        this.b = new VideoTooltip(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r10 == com.vk.libvideo.tooltips.WatchLaterTooltip.Hint.ACTION) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Hint hint) {
        Integer num;
        HintId i = hint.i();
        int i2 = 48;
        if (this.a.getResources().getConfiguration().orientation != 2) {
            if (hint == Hint.BUTTON) {
                i2 = 80;
            } else if (hint != Hint.MENU) {
            }
            num = i2;
            VideoTooltip.b(this.b, i, new a(this, hint), new VideoTooltip.b(0L, num, null, null, null, 125));
        }
        num = null;
        VideoTooltip.b(this.b, i, new a(this, hint), new VideoTooltip.b(0L, num, null, null, null, 125));
    }

    /* compiled from: WatchLaterTooltip.kt */
    public static final class a implements VideoTooltip.a {
        public final /* synthetic */ Hint a;

        public a(WatchLaterTooltip watchLaterTooltip, Hint hint) {
            this.a = hint;
        }

        @Override // com.vk.libvideo.tooltips.VideoTooltip.a
        public final void a() {
            l7v b = pla.e().b();
            zrp<Hint> h = Hint.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : h) {
                if (((Hint) obj) != this.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.vk.dto.hints.Hint p = b.p(((Hint) it.next()).i().getId());
                if (p != null) {
                    arrayList2.add(p);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                b.s((com.vk.dto.hints.Hint) it2.next());
            }
        }

        @Override // com.vk.libvideo.tooltips.VideoTooltip.a
        public final void onClick() {
        }
    }
}
