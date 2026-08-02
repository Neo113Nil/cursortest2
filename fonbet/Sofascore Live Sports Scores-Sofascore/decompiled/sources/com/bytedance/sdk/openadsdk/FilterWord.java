package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class FilterWord {
    private boolean gm;
    private List<FilterWord> oo;
    private String pcc;
    private String sf;

    public FilterWord(String str, String str2) {
        this.pcc = str;
        this.sf = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        List list = this.oo;
        if (list == null) {
            list = new ArrayList();
            this.oo = list;
        }
        list.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.pcc;
    }

    public boolean getIsSelected() {
        return this.gm;
    }

    public String getName() {
        return this.sf;
    }

    public List<FilterWord> getOptions() {
        return this.oo;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.oo;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.pcc) || TextUtils.isEmpty(this.sf)) ? false : true;
    }

    public void setId(String str) {
        this.pcc = str;
    }

    public void setIsSelected(boolean z) {
        this.gm = z;
    }

    public void setName(String str) {
        this.sf = str;
    }

    public FilterWord() {
    }
}
