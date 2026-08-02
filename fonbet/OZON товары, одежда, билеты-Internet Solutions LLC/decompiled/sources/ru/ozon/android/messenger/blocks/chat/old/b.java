package ru.ozon.android.messenger.blocks.chat.old;

import ru.ozon.android.messenger.blocks.chat.old.ChatDTO;

/* loaded from: classes10.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84565a;

    static {
        int[] iArr = new int[ChatDTO.PreviewDTO.a.values().length];
        try {
            iArr[ChatDTO.PreviewDTO.a.DELIVERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatDTO.PreviewDTO.a.READ.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f84565a = iArr;
    }
}
