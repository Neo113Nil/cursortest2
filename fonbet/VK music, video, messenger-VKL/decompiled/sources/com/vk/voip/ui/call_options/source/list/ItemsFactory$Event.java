package com.vk.voip.ui.call_options.source.list;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemsFactory.kt */
/* loaded from: classes7.dex */
public final class ItemsFactory$Event {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemsFactory$Event[] $VALUES;
    public static final ItemsFactory$Event AUDIO;
    public static final ItemsFactory$Event MAX;
    public static final ItemsFactory$Event VIDEO;
    private final int id;

    static {
        ItemsFactory$Event itemsFactory$Event = new ItemsFactory$Event(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, 1);
        VIDEO = itemsFactory$Event;
        ItemsFactory$Event itemsFactory$Event2 = new ItemsFactory$Event(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, 2);
        AUDIO = itemsFactory$Event2;
        ItemsFactory$Event itemsFactory$Event3 = new ItemsFactory$Event("MAX", 2, 3);
        MAX = itemsFactory$Event3;
        ItemsFactory$Event[] itemsFactory$EventArr = {itemsFactory$Event, itemsFactory$Event2, itemsFactory$Event3};
        $VALUES = itemsFactory$EventArr;
        $ENTRIES = new asp(itemsFactory$EventArr);
    }

    public ItemsFactory$Event(String str, int i, int i2) {
        this.id = i2;
    }

    public static ItemsFactory$Event valueOf(String str) {
        return (ItemsFactory$Event) Enum.valueOf(ItemsFactory$Event.class, str);
    }

    public static ItemsFactory$Event[] values() {
        return (ItemsFactory$Event[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
