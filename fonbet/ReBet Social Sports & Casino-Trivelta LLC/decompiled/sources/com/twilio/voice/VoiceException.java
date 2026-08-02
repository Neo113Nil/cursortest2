package com.twilio.voice;

/* loaded from: classes4.dex */
public class VoiceException extends Exception {
    private int errorCode;
    private String errorMessage;
    private String explanation;
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN = 20101;
    static final VoiceException InvalidAccessTokenException = new VoiceException(EXCEPTION_INVALID_ACCESS_TOKEN, "Invalid access token", "Twilio was unable to validate your Access Token");
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_HEADER = 20102;
    static final VoiceException InvalidAccessTokenHeaderException = new VoiceException(EXCEPTION_INVALID_ACCESS_TOKEN_HEADER, "Invalid access token header", "The header of the Access Token provided to the Twilio API was invalid");
    public static final int EXCEPTION_INVALID_ISSUER_SUBJECT = 20103;
    static final VoiceException InvalidIssuerSubjectException = new VoiceException(EXCEPTION_INVALID_ISSUER_SUBJECT, "Invalid access token issuer/subject", "The issuer or subject of the Access Token provided to the Twilio API was invalid");
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_EXPIRY = 20104;
    static final VoiceException InvalidAccessTokenExpiryException = new VoiceException(EXCEPTION_INVALID_ACCESS_TOKEN_EXPIRY, "Access token expired or expiration date invalid", "The Access Token provided to the Twilio API has expired, the expiration time specified in the token was invalid");
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_NOT_VALID_YET = 20105;
    static final VoiceException InvalidAccessTokenNotValidYetException = new VoiceException(EXCEPTION_INVALID_ACCESS_TOKEN_NOT_VALID_YET, "Access token not yet valid", "The Access Token provided to the Twilio API is not yet valid");
    public static final int EXCEPTION_INVALID_ACCESS_TOKEN_GRANT = 20106;
    static final VoiceException InvalidAccessTokenGrantException = new VoiceException(EXCEPTION_INVALID_ACCESS_TOKEN_GRANT, "Invalid access token grants", "The Access Token signature and issuer were valid, but the grants specified in the token were invalid, unparseable, or did not authorize the action being requested");
    public static final int EXCEPTION_INVALID_SIGNATURE = 20107;
    static final VoiceException InvalidSignatureException = new VoiceException(EXCEPTION_INVALID_SIGNATURE, "Invalid access token signature", "The signature for the Access Token provided was invalid");
    public static final int EXCEPTION_AUTH_FAILURE = 20151;
    static final VoiceException AuthFailureException = new VoiceException(EXCEPTION_AUTH_FAILURE, "Authentication Failed", "The Authentication with the provided JWT failed");
    public static final int EXCEPTION_INVALID_TTL = 20157;
    static final VoiceException InvalidTTLException = new VoiceException(EXCEPTION_INVALID_TTL, "Expiration Time Exceeds Maximum Time Allowed", "The expiration time provided when creating the JWT exceeds the maximum duration allowed");
    public static final int EXCEPTION_INVALID_TOKEN = 20403;
    static final VoiceException InvalidTokenException = new VoiceException(EXCEPTION_INVALID_TOKEN, "403 Forbidden", "The account lacks permission to access the Twilio API. Typically this means the account has been suspended or closed. For assistance, please contact support");
    public static final int EXCEPTION_ACCESS_TOKEN_REJECTED = 51007;
    static final VoiceException AccessTokenRejectedException = new VoiceException(EXCEPTION_ACCESS_TOKEN_REJECTED, "Token authentication is rejected by authentication service", "The authentication service has rejected the provided Access Token. To check whether the Access Token is structurally correct, you can use the tools available at https://jwt.io. For the details of Twilio's specific Access Token implementation including the grant format, check https://www.twilio.com/docs/iam/access-tokens");
    public static final int EXCEPTION_BAD_REQUEST = 31400;
    static final VoiceException BadRequestException = new VoiceException(EXCEPTION_BAD_REQUEST, "Bad Request", "The request could not be understood due to malformed syntax.");
    public static final int EXCEPTION_FORBIDDEN = 31403;
    static final VoiceException ForbiddenException = new VoiceException(EXCEPTION_FORBIDDEN, "Forbidden", "The server understood the request, but is refusing to fulfill it.");
    public static final int EXCEPTION_NOT_FOUND = 31404;
    static final VoiceException NotFoundException = new VoiceException(EXCEPTION_NOT_FOUND, "Not Found", "The server has not found anything matching the request.");
    public static final int EXCEPTION_REQUEST_TIMEOUT = 31408;
    static final VoiceException RequestTimeoutException = new VoiceException(EXCEPTION_REQUEST_TIMEOUT, "Request Timeout", "A request timeout occurred.");
    public static final int EXCEPTION_INTERNAL_SERVER_ERROR = 31500;
    static final VoiceException InternalServerErrorException = new VoiceException(EXCEPTION_INTERNAL_SERVER_ERROR, "Internal Server Error", "The server could not fulfill the request due to some unexpected condition.");
    public static final int EXCEPTION_BAD_GATEWAY = 31502;
    static final VoiceException BadGatewayException = new VoiceException(EXCEPTION_BAD_GATEWAY, "Bad Gateway", "The server is acting as a gateway or proxy, and received an invalid response from a downstream server while attempting to fulfill the request.");
    public static final int EXCEPTION_SERVICE_UNAVAILABLE = 31503;
    static final VoiceException ServiceUnavailableException = new VoiceException(EXCEPTION_SERVICE_UNAVAILABLE, "Service Unavailable", "The server is currently unable to handle the request due to a temporary overloading or maintenance of the server.");
    public static final int EXCEPTION_GATEWAY_TIMEOUT = 31504;
    static final VoiceException GatewayTimeoutException = new VoiceException(EXCEPTION_GATEWAY_TIMEOUT, "Gateway Timeout", "The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server.");

    public VoiceException(int i10, String str, String str2) {
        this.errorCode = i10;
        this.errorMessage = str;
        this.explanation = str2;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getExplanation() {
        return this.explanation;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.errorMessage;
    }
}
