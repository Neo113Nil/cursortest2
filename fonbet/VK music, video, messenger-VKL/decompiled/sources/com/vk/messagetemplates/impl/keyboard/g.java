package com.vk.messagetemplates.impl.keyboard;

import android.content.Context;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.messagetemplates.impl.common.Template;
import com.vk.messagetemplates.impl.common.TemplateArgs;
import com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardState;
import com.vk.messagetemplates.impl.keyboard.h;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.brm0;
import xsna.c5g;
import xsna.izs;
import xsna.x8o0;

/* compiled from: TemplatesKeyboardStateMapper.kt */
/* loaded from: classes3.dex */
public final class g implements izs<TemplatesKeyboardState, h> {
    public final Context b;

    /* compiled from: TemplatesKeyboardStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TemplatesKeyboardState.State.values().length];
            try {
                iArr[TemplatesKeyboardState.State.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TemplatesKeyboardState.State.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g(Context context) {
        this.b = context;
    }

    @Override // xsna.izs
    public final h invoke(TemplatesKeyboardState templatesKeyboardState) {
        ButtonState buttonState;
        String str;
        TemplatesKeyboardState templatesKeyboardState2 = templatesKeyboardState;
        List<MsgTemplate> list = templatesKeyboardState2.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MsgTemplate msgTemplate : list) {
            int i = msgTemplate.b;
            String str2 = msgTemplate.c;
            TemplateArgs templateArgs = templatesKeyboardState2.b;
            String str3 = msgTemplate.d;
            for (Template template : Template.h()) {
                int i2 = x8o0.$EnumSwitchMapping$0[template.ordinal()];
                Context context = this.b;
                switch (i2) {
                    case 1:
                        str = templateArgs.b;
                        break;
                    case 2:
                        str = templateArgs.c;
                        break;
                    case 3:
                        str = templateArgs.d;
                        break;
                    case 4:
                        str = templateArgs.e;
                        break;
                    case 5:
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 0 || i3 >= 5) {
                            if (5 > i3 || i3 >= 12) {
                                if (12 > i3 || i3 >= 20) {
                                    str = context.getString(R.string.greeting_evening_template);
                                    break;
                                } else {
                                    str = context.getString(R.string.greeting_day_template);
                                    break;
                                }
                            } else {
                                str = context.getString(R.string.greeting_morning_template);
                                break;
                            }
                        } else {
                            str = context.getString(R.string.greeting_night_template);
                            break;
                        }
                        break;
                    case 6:
                        str = context.getString(R.string.goodbye_common_template);
                        break;
                    case 7:
                        str = templateArgs.f;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                str3 = brm0.y(str3, template.getFormat(), str);
            }
            arrayList.add(new h.a(i, str2, str3));
        }
        int i4 = a.$EnumSwitchMapping$0[templatesKeyboardState2.d.ordinal()];
        if (i4 == 1) {
            buttonState = ButtonState.NORMAL;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            buttonState = ButtonState.LOADING;
        }
        return new h(arrayList, buttonState);
    }
}
