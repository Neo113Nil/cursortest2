package com.vk.movika.sdk.android.defaultplayer.layout;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.vej;

/* loaded from: classes3.dex */
public final class a implements vej {
    public final Context a;

    @Override // xsna.vej
    public String a(int i, String... strArr) {
        Context context = this.a;
        switch (i) {
            case 0:
                return context.getString(R.string.vkim_contacts_all);
            case 1:
                return context.getString(R.string.vkim_contacts_important);
            case 2:
                return context.getString(R.string.vkim_contacts_birthday);
            case 3:
                return context.getString(R.string.vkim_contacts_contacts);
            case 4:
                return context.getString(R.string.vkim_recent_contacts);
            case 5:
                return context.getString(R.string.vkim_contacts_search_section_header);
            case 6:
                return context.getString(R.string.vkim_contacts_included);
            case 7:
            default:
                return "…";
            case 8:
                String string = context.getString(R.string.vkim_contacts_from_root_conversation);
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                return String.format(string, Arrays.copyOf(copyOf, copyOf.length));
            case 9:
                return context.getString(R.string.vkim_contacts);
            case 10:
                return context.getString(R.string.vkim_contacts_global_search);
        }
    }

    public float b(int i) {
        return this.a.getResources().getDimension(i);
    }
}
