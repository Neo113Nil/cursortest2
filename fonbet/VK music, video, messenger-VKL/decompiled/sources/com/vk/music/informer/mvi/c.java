package com.vk.music.informer.mvi;

import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import xsna.alb0;
import xsna.lg90;
import xsna.qzu0;

/* compiled from: MusicPlayerInformerContentView.kt */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: MusicPlayerInformerContentView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicPlayerInformerViewState.Icons.values().length];
            try {
                iArr[MusicPlayerInformerViewState.Icons.TICKET_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicPlayerInformerViewState.Icons.MERCH_ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static lg90 a(MusicPlayerInformerViewState.Icons icons, androidx.compose.runtime.a aVar) {
        lg90 v1;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(754519015, 48, -1, "com.vk.music.informer.mvi.MusicPlayerInformerDefaults.getIcon (MusicPlayerInformerContentView.kt:115)");
        }
        int i = a.$EnumSwitchMapping$0[icons.ordinal()];
        if (i == 1) {
            aVar.K(-756694762);
            qzu0.a.getClass();
            v1 = qzu0.v1(aVar);
            aVar.j();
        } else {
            if (i != 2) {
                throw alb0.c(-756697124, aVar);
            }
            aVar.K(-756692170);
            qzu0.a.getClass();
            v1 = qzu0.v1(aVar);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return v1;
    }
}
