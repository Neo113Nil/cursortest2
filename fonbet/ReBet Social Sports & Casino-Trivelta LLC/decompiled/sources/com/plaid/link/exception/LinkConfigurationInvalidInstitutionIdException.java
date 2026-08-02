package com.plaid.link.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/plaid/link/exception/LinkConfigurationInvalidInstitutionIdException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinkConfigurationInvalidInstitutionIdException extends InvalidLinkConfigurationException {

    @NotNull
    public static final LinkConfigurationInvalidInstitutionIdException INSTANCE = new LinkConfigurationInvalidInstitutionIdException();

    private LinkConfigurationInvalidInstitutionIdException() {
        super("Your app is not permitted to use custom initializers, please contact support at https://dashboard.plaid.com/support.", null);
    }
}
