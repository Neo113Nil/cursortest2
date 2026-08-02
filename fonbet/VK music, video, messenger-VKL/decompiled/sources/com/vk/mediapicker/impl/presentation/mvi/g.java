package com.vk.mediapicker.impl.presentation.mvi;

import android.content.Context;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import xsna.gk;

/* compiled from: MediaPickerViewStateMapper.kt */
/* loaded from: classes3.dex */
public final class g {
    public final Context a;
    public final gk b;

    /* compiled from: MediaPickerViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerMviState.Pagination.values().length];
            try {
                iArr[MediaPickerMviState.Pagination.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerMviState.Pagination.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g(Context context) {
        this.a = context;
        this.b = new gk(context);
    }
}
