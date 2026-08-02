package com.vk.video.ui.discovery.minimizable.related_videos;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.asu0;
import xsna.dhr0;
import xsna.fnj;
import xsna.gko;
import xsna.iah0;
import xsna.ig4;
import xsna.ikv0;
import xsna.pkv0;
import xsna.whg0;
import xsna.x7g;
import xsna.zrp;

/* compiled from: VideoDiscoveryRelatedVideosSnackBarManager.kt */
/* loaded from: classes7.dex */
public final class VideoDiscoveryRelatedVideosSnackBarManager {
    public final Context a;
    public ikv0 b;
    public ikv0.d c;
    public io.reactivex.rxjava3.disposables.c d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDiscoveryRelatedVideosSnackBarManager.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event Loop;
        public static final Event LoopDisable;
        public static final Event Shuffle;
        public static final Event SingleVideoLoop;
        public static final Event SortInverse;
        public static final Event SortNormal;

        static {
            Event event = new Event("SortNormal", 0);
            SortNormal = event;
            Event event2 = new Event("SortInverse", 1);
            SortInverse = event2;
            Event event3 = new Event("Shuffle", 2);
            Shuffle = event3;
            Event event4 = new Event("Loop", 3);
            Loop = event4;
            Event event5 = new Event("SingleVideoLoop", 4);
            SingleVideoLoop = event5;
            Event event6 = new Event("LoopDisable", 5);
            LoopDisable = event6;
            Event[] eventArr = {event, event2, event3, event4, event5, event6};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoDiscoveryRelatedVideosSnackBarManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Event.values().length];
            try {
                iArr[Event.SortNormal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.SortInverse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Event.Shuffle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Event.SingleVideoLoop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Event.LoopDisable.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Event.Loop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoDiscoveryRelatedVideosSnackBarManager(Context context) {
        this.a = context;
    }

    public final void a(Event event) {
        int i;
        int i2;
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.d = io.reactivex.rxjava3.core.a.s(5000L, timeUnit, asu0.i()).o(asu0Var.d()).subscribe(new ig4(this, 8));
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[event.ordinal()]) {
            case 1:
            case 2:
                i = R.drawable.vk_icon_sort_outline_28;
                break;
            case 3:
                i = R.drawable.vk_icon_shuffle_outline_28;
                break;
            case 4:
                i = R.drawable.vk_icon_repeat_1_outline_28;
                break;
            case 5:
            case 6:
                i = R.drawable.vk_icon_repeat_outline_28;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ikv0.c.C3058c c3058c = new ikv0.c.C3058c(new gko(i), new x7g(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
        switch (iArr[event.ordinal()]) {
            case 1:
                i2 = R.string.playlist_sort_description_info;
                break;
            case 2:
                i2 = R.string.playlist_sort_inverse_description_info;
                break;
            case 3:
                i2 = R.string.playlist_shuffle_info;
                break;
            case 4:
                i2 = R.string.playlist_loop_single_video_info;
                break;
            case 5:
                i2 = R.string.playlist_loop_disable_info;
                break;
            case 6:
                i2 = R.string.playlist_loop_info;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Context context = this.a;
        ikv0.d dVar = new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6);
        ikv0 ikv0Var = this.b;
        if (ikv0Var != null) {
            ikv0Var.c.setLeft(c3058c);
            ikv0.d dVar2 = this.c;
            if (dVar2 != null) {
                dVar2.a.k(dVar.a());
                return;
            }
            return;
        }
        this.c = dVar;
        dhr0.a.getClass();
        ikv0.a aVar = new ikv0.a(dhr0.t(context));
        aVar.e = -1L;
        aVar.t = c3058c;
        aVar.u = dVar;
        aVar.l = 80;
        aVar.h = new whg0(this, 20);
        HashSet hashSet = iah0.a;
        if (fnj.b(context)) {
            aVar.k = 1;
            aVar.g(81);
        }
        this.b = pkv0.f(aVar);
    }
}
