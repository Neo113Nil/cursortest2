package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.pmi0;

/* compiled from: PurchaseDetailsButtonDto.kt */
/* loaded from: classes5.dex */
public final class PurchaseDetailsButtonDto {

    @pmi0("action")
    private final ButtonActionDto action;

    @pmi0("title")
    private final String title;

    public PurchaseDetailsButtonDto(String str, ButtonActionDto buttonActionDto) {
        this.title = str;
        this.action = buttonActionDto;
    }

    public final ButtonActionDto a() {
        return this.action;
    }

    public final String b() {
        return this.title;
    }
}
