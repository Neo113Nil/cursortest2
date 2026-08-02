package com.vk.movika.tools.controls.seekbar;

import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import java.util.Comparator;
import xsna.wzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ wzs c;

    public /* synthetic */ e(int i, wzs wzsVar) {
        this.b = i;
        this.c = wzsVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.b;
        wzs wzsVar = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                return ((Number) ((o) wzsVar).invoke(obj, obj2)).intValue();
            default:
                return ((Number) wzsVar.invoke(obj, obj2)).intValue();
        }
    }
}
