package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;

/* loaded from: classes10.dex */
public final class k {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86962a;

        static {
            int[] iArr = new int[IslandSeparatorDTO.Configuration.values().length];
            try {
                iArr[IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IslandSeparatorDTO.Configuration.SECTION_BEGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IslandSeparatorDTO.Configuration.WITHOUT_CORNERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IslandSeparatorDTO.Configuration.SECTION_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f86962a = iArr;
        }
    }
}
