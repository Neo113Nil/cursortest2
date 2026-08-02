package com.vk.sdk.api.pages.dto;

import xsna.cgn;
import xsna.epx;
import xsna.i5s;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;

/* compiled from: PagesWikipageHistoryDto.kt */
/* loaded from: classes5.dex */
public final class PagesWikipageHistoryDto {

    @pmi0("date")
    private final int date;

    @pmi0("editor_id")
    private final int editorId;

    @pmi0("editor_name")
    private final String editorName;

    @pmi0("id")
    private final int id;

    @pmi0("length")
    private final int length;

    public PagesWikipageHistoryDto(int i, int i2, int i3, int i4, String str) {
        this.id = i;
        this.length = i2;
        this.date = i3;
        this.editorId = i4;
        this.editorName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesWikipageHistoryDto)) {
            return false;
        }
        PagesWikipageHistoryDto pagesWikipageHistoryDto = (PagesWikipageHistoryDto) obj;
        return this.id == pagesWikipageHistoryDto.id && this.length == pagesWikipageHistoryDto.length && this.date == pagesWikipageHistoryDto.date && this.editorId == pagesWikipageHistoryDto.editorId && epx.f(this.editorName, pagesWikipageHistoryDto.editorName);
    }

    public final int hashCode() {
        return this.editorName.hashCode() + shy.a(this.editorId, shy.a(this.date, shy.a(this.length, Integer.hashCode(this.id) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.id;
        int i2 = this.length;
        int i3 = this.date;
        int i4 = this.editorId;
        String str = this.editorName;
        StringBuilder a = odj.a(i, i2, "PagesWikipageHistoryDto(id=", ", length=", ", date=");
        cgn.a(i3, i4, ", editorId=", ", editorName=", a);
        return i5s.a(a, str, ")");
    }
}
