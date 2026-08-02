package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.pmi0;

/* compiled from: PurchaseDetailsDto.kt */
/* loaded from: classes5.dex */
public final class PurchaseDetailsDto {

    @pmi0("button")
    private final PurchaseDetailsButtonDto button;

    @pmi0("label")
    private final String label;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    public PurchaseDetailsDto(String str, String str2, String str3, PurchaseDetailsButtonDto purchaseDetailsButtonDto) {
        this.label = str;
        this.title = str2;
        this.text = str3;
        this.button = purchaseDetailsButtonDto;
    }

    public final PurchaseDetailsButtonDto a() {
        return this.button;
    }

    public final String b() {
        return this.label;
    }

    public final String c() {
        return this.text;
    }

    public final String d() {
        return this.title;
    }
}
