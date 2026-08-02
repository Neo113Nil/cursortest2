package ru.ozon.android.messenger.blocks.chat.common;

import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.chat.common.PreviewDTO;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class i {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84537a;

        static {
            int[] iArr = new int[PreviewDTO.a.values().length];
            try {
                iArr[PreviewDTO.a.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreviewDTO.a.READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84537a = iArr;
        }
    }

    @NotNull
    public static final PreviewVO a(@NotNull PreviewDTO previewDTO) {
        Intrinsics.checkNotNullParameter(previewDTO, "<this>");
        String text = previewDTO.getText();
        List<Icon> images = previewDTO.getImages();
        if (images == null) {
            images = K.f71697a;
        }
        List<Icon> list = images;
        DateTime date = previewDTO.getDate();
        PreviewDTO.a status = previewDTO.getStatus();
        int i11 = status == null ? -1 : a.f84537a[status.ordinal()];
        return new PreviewVO(text, list, date, i11 != 1 ? i11 != 2 ? z.d.f91566a : z.e.f91567a : z.f.f91568a, previewDTO.getChatStatus(), false);
    }
}
