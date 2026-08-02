package com.vk.sharing.core.picker;

import android.content.Context;
import android.content.Intent;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.sharing.api.dto.GroupPickerInfo;
import xsna.asp;
import xsna.bja0;
import xsna.zrp;

/* compiled from: PickingImpl.kt */
/* loaded from: classes5.dex */
public final class PickingImpl implements bja0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PickingImpl.kt */
    public static final class PickerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PickerType[] $VALUES;
        public static final PickerType CLIPS_AUTHOR_PICKER;
        public static final PickerType DEFAULT;
        public static final PickerType PORTRAIT_SHARING;

        static {
            PickerType pickerType = new PickerType("DEFAULT", 0);
            DEFAULT = pickerType;
            PickerType pickerType2 = new PickerType("PORTRAIT_SHARING", 1);
            PORTRAIT_SHARING = pickerType2;
            PickerType pickerType3 = new PickerType("CLIPS_AUTHOR_PICKER", 2);
            CLIPS_AUTHOR_PICKER = pickerType3;
            PickerType[] pickerTypeArr = {pickerType, pickerType2, pickerType3};
            $VALUES = pickerTypeArr;
            $ENTRIES = new asp(pickerTypeArr);
        }

        public PickerType() {
            throw null;
        }

        public static PickerType valueOf(String str) {
            return (PickerType) Enum.valueOf(PickerType.class, str);
        }

        public static PickerType[] values() {
            return (PickerType[]) $VALUES.clone();
        }
    }

    /* compiled from: PickingImpl.kt */
    public static final class a implements bja0.a {
        public final Context a;
        public final GroupPickerInfo b = new GroupPickerInfo();

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.bja0.a
        public final void a(int i, FragmentImpl fragmentImpl) {
            fragmentImpl.startActivityForResult(b(), i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        
            if (r1 != 3) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Intent b() {
            GroupPickerInfo groupPickerInfo = this.b;
            int i = groupPickerInfo.k;
            int i2 = 1;
            if (i != 1) {
                int i3 = i != 2 ? 3 : 2;
                i2 = i3;
            }
            PickerType pickerType = PickerType.PORTRAIT_SHARING;
            Context context = this.a;
            return (pickerType == null ? new Intent(context, (Class<?>) PortraitPickerActivity.class) : PickerType.CLIPS_AUTHOR_PICKER == null ? new Intent(context, (Class<?>) ClipsAuthorPickerActivity.class) : new Intent(context, (Class<?>) GroupPickerActivity.class)).putExtra(X3.a.t, i2).putExtra("picker_info", groupPickerInfo).putExtra("fullscreen", false);
        }
    }

    @Override // xsna.bja0
    public final a a(Context context) {
        return new a(context);
    }
}
